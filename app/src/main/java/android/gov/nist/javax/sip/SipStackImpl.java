package android.gov.nist.javax.sip;

import R.a;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.LogWriter;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.core.net.DefaultSecurityManagerProvider;
import android.gov.nist.core.net.NetworkLayer;
import android.gov.nist.core.net.SecurityManagerProvider;
import android.gov.nist.core.net.SslNetworkLayer;
import android.gov.nist.javax.sip.clientauthutils.AccountManager;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelperImpl;
import android.gov.nist.javax.sip.clientauthutils.SecureAccountManager;
import android.gov.nist.javax.sip.parser.MessageParserFactory;
import android.gov.nist.javax.sip.parser.PostParseExecutorServices;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.parser.StringMsgParserFactory;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.ByteBufferFactory;
import android.gov.nist.javax.sip.stack.ClientAuthType;
import android.gov.nist.javax.sip.stack.DefaultMessageLogFactory;
import android.gov.nist.javax.sip.stack.DefaultRouter;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import android.gov.nist.javax.sip.stack.MessageProcessorFactory;
import android.gov.nist.javax.sip.stack.NIOMode;
import android.gov.nist.javax.sip.stack.OIOMessageProcessorFactory;
import android.gov.nist.javax.sip.stack.SIPEventInterceptor;
import android.gov.nist.javax.sip.stack.SIPMessageValve;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.timers.DefaultSipTimer;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.g;
import android.javax.sip.h;
import android.javax.sip.j;
import android.javax.sip.n;
import android.javax.sip.p;
import android.javax.sip.q;
import android.javax.sip.r;
import b.AbstractC2093c;
import c.AbstractC2270z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;

/* loaded from: classes.dex */
public class SipStackImpl extends SIPTransactionStack implements r, SipStackExt {
    private String[] cipherSuites;
    private Properties configurationProperties;
    private String[] enabledProtocols;
    private EventScanner eventScanner;
    protected Hashtable<String, ListeningPointImpl> listeningPoints;
    private boolean reEntrantListener;
    p sipListener;
    protected List<SipProviderImpl> sipProviders;
    private Semaphore stackSemaphore;
    TlsSecurityPolicy tlsSecurityPolicy;
    private static StackLogger logger = CommonLogger.getLogger(SipStackImpl.class);
    public static final Integer MAX_DATAGRAM_SIZE = 65536;
    public static final String[] DEFAULT_CIPHERS = {"TLS_RSA_WITH_AES_128_CBC_SHA", "SSL_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"};

    public SipStackImpl() {
        this.stackSemaphore = new Semaphore(1);
        this.cipherSuites = DEFAULT_CIPHERS;
        this.enabledProtocols = new String[]{"TLSv1.2", "TLSv1.1", "TLSv1"};
        super.setMessageFactory(new NistSipMessageFactoryImpl(this));
        this.eventScanner = new EventScanner(this);
        this.listeningPoints = new Hashtable<>();
        this.sipProviders = new CopyOnWriteArrayList();
        try {
            if (Charset.forName("UTF-8") != null) {
                return;
            }
            throw new UnsupportedCharsetException("Unsupported charset UTF-8");
        } catch (Exception e10) {
            StackLogger stackLogger = logger;
            stackLogger.logWarning("UTF-8 charset cannot be used this system. This will lead to unpredictable behavior when parsing SIP messages: " + e10.getMessage());
        }
    }

    private void reInitialize() {
        super.reInit();
        this.eventScanner = new EventScanner(this);
        this.listeningPoints = new Hashtable<>();
        this.sipProviders = new CopyOnWriteArrayList();
        this.sipListener = null;
        if (!getTimer().isStarted()) {
            try {
                setTimer((SipTimer) Class.forName(this.configurationProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
                getTimer().start(this, this.configurationProperties);
                if (getThreadAuditor() != null && getThreadAuditor().isEnabled()) {
                    getTimer().schedule(new SIPTransactionStack.PingTimer(null), 0L);
                }
            } catch (Exception e10) {
                logger.logError("Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME", e10);
            }
        }
    }

    public boolean acquireSem() {
        try {
            return this.stackSemaphore.tryAcquire(10L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Deprecated
    public void addLogAppender(Appender appender) {
        StackLogger stackLogger = logger;
        if (stackLogger instanceof LogWriter) {
            ((LogWriter) stackLogger).addAppender(appender);
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Throwable, android.javax.sip.g, java.lang.Exception] */
    @Override // android.gov.nist.javax.sip.SipStackExt
    public synchronized h createListeningPoint(String str, int i10, String str2) {
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("createListeningPoint : address = " + str + " port = " + i10 + " transport = " + str2);
            }
            if (str == null) {
                throw new NullPointerException("Address for listening point is null!");
            }
            if (str2 == null) {
                throw new NullPointerException("null transport");
            }
            if (i10 > 0) {
                if (!str2.equalsIgnoreCase("UDP") && !str2.equalsIgnoreCase("TLS") && !str2.equalsIgnoreCase("TCP") && !str2.equalsIgnoreCase("SCTP") && !str2.equalsIgnoreCase(ListeningPointExt.WS) && !str2.equalsIgnoreCase(ListeningPointExt.WSS)) {
                    throw new n("bad transport ".concat(str2));
                }
                if (!isAlive()) {
                    this.toExit = false;
                    reInitialize();
                }
                String makeKey = ListeningPointImpl.makeKey(str, i10, str2);
                ListeningPointImpl listeningPointImpl = this.listeningPoints.get(makeKey);
                if (listeningPointImpl != null) {
                    return listeningPointImpl;
                }
                try {
                    MessageProcessor createMessageProcessor = createMessageProcessor(InetAddress.getByName(str), i10, str2);
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("Created Message Processor: " + str + " port = " + i10 + " transport = " + str2);
                    }
                    ListeningPointImpl listeningPointImpl2 = new ListeningPointImpl(this, i10, str2);
                    listeningPointImpl2.messageProcessor = createMessageProcessor;
                    createMessageProcessor.setListeningPoint(listeningPointImpl2);
                    this.listeningPoints.put(makeKey, listeningPointImpl2);
                    createMessageProcessor.start();
                    return listeningPointImpl2;
                } catch (IOException e10) {
                    if (logger.isLoggingEnabled()) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logError("Invalid argument address = " + str + " port = " + i10 + " transport = " + str2);
                    }
                    ?? exc = new Exception(e10.getMessage());
                    exc.f24332Y = e10;
                    throw exc;
                }
            }
            throw new g("bad port");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public q createSipProvider(h hVar) {
        if (hVar != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("createSipProvider: " + hVar);
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) hVar;
            if (listeningPointImpl.sipProvider == null) {
                SipProviderImpl sipProviderImpl = new SipProviderImpl(this);
                sipProviderImpl.setListeningPoint(listeningPointImpl);
                listeningPointImpl.sipProvider = sipProviderImpl;
                this.sipProviders.add(sipProviderImpl);
                return sipProviderImpl;
            }
            throw new n("Provider already attached!");
        }
        throw new NullPointerException("null listeningPoint");
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void deleteListeningPoint(h hVar) {
        if (hVar != null) {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) hVar;
            super.removeMessageProcessor(listeningPointImpl.messageProcessor);
            this.listeningPoints.remove(listeningPointImpl.getKey());
            return;
        }
        throw new NullPointerException("null listeningPoint arg");
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void deleteSipProvider(q qVar) {
        if (qVar != null) {
            SipProviderImpl sipProviderImpl = (SipProviderImpl) qVar;
            if (sipProviderImpl.getSipListener() == null) {
                sipProviderImpl.removeListeningPoints();
                sipProviderImpl.stop();
                this.sipProviders.remove(qVar);
                if (this.sipProviders.isEmpty()) {
                    stopStack();
                    return;
                }
                return;
            }
            throw new n("SipProvider still has an associated SipListener!");
        }
        throw new NullPointerException("null provider arg");
    }

    public void finalize() {
        stopStack();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public AuthenticationHelper getAuthenticationHelper(AccountManager accountManager, AbstractC2270z abstractC2270z) {
        return new AuthenticationHelperImpl(this, accountManager, abstractC2270z);
    }

    public Properties getConfigurationProperties() {
        return this.configurationProperties;
    }

    public String[] getEnabledCipherSuites() {
        return this.cipherSuites;
    }

    public String[] getEnabledProtocols() {
        return this.enabledProtocols;
    }

    public EventScanner getEventScanner() {
        return this.eventScanner;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public String getIPAddress() {
        return super.getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public Iterator getListeningPoints() {
        return this.listeningPoints.values().iterator();
    }

    public LogRecordFactory getLogRecordFactory() {
        return this.logRecordFactory;
    }

    @Deprecated
    public Logger getLogger() {
        StackLogger stackLogger = logger;
        if (stackLogger instanceof LogWriter) {
            return ((LogWriter) stackLogger).getLogger();
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public AuthenticationHelper getSecureAuthenticationHelper(SecureAccountManager secureAccountManager, AbstractC2270z abstractC2270z) {
        return new AuthenticationHelperImpl(this, secureAccountManager, abstractC2270z);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionStack
    public p getSipListener() {
        return this.sipListener;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public Iterator<SipProviderImpl> getSipProviders() {
        return this.sipProviders.iterator();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public String getStackName() {
        return this.stackName;
    }

    public TlsSecurityPolicy getTlsSecurityPolicy() {
        return this.tlsSecurityPolicy;
    }

    public boolean isAutomaticDialogErrorHandlingEnabled() {
        return this.isAutomaticDialogErrorHandlingEnabled;
    }

    public boolean isAutomaticDialogSupportEnabled() {
        return this.isAutomaticDialogSupportEnabled;
    }

    public boolean isBackToBackUserAgent() {
        return this.isBackToBackUserAgent;
    }

    public boolean isReEntrantListener() {
        return this.reEntrantListener;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public boolean isRetransmissionFilterActive() {
        return true;
    }

    public void releaseSem() {
        this.stackSemaphore.release();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void setEnabledCipherSuites(String[] strArr) {
        this.cipherSuites = strArr;
    }

    public void setEnabledProtocols(String[] strArr) {
        this.enabledProtocols = strArr;
    }

    public void setIsBackToBackUserAgent(boolean z10) {
        this.isBackToBackUserAgent = z10;
    }

    public void setTlsSecurityPolicy(TlsSecurityPolicy tlsSecurityPolicy) {
        this.tlsSecurityPolicy = tlsSecurityPolicy;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void start() {
        if (this.eventScanner == null) {
            this.eventScanner = new EventScanner(this);
        }
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void stop() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("stopStack -- stoppping the stack");
            logger.logStackTrace();
        }
        stopStack();
        if (this.sipMessageValves.size() != 0) {
            for (SIPMessageValve sIPMessageValve : this.sipMessageValves) {
                sIPMessageValve.destroy();
            }
        }
        SIPEventInterceptor sIPEventInterceptor = this.sipEventInterceptor;
        if (sIPEventInterceptor != null) {
            sIPEventInterceptor.destroy();
        }
        this.sipProviders = new CopyOnWriteArrayList();
        this.listeningPoints = new Hashtable<>();
        EventScanner eventScanner = this.eventScanner;
        if (eventScanner != null) {
            eventScanner.forceStop();
        }
        this.eventScanner = null;
        PostParseExecutorServices.shutdownThreadpool();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0588 A[Catch: NumberFormatException -> 0x059a, TRY_ENTER, TryCatch #22 {NumberFormatException -> 0x059a, blocks: (B:201:0x0588, B:203:0x0597, B:206:0x059c), top: B:394:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x059c A[Catch: NumberFormatException -> 0x059a, TRY_LEAVE, TryCatch #22 {NumberFormatException -> 0x059a, blocks: (B:201:0x0588, B:203:0x0597, B:206:0x059c), top: B:394:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x091f A[Catch: Exception -> 0x0939, TryCatch #25 {Exception -> 0x0939, blocks: (B:285:0x0905, B:287:0x091f, B:289:0x0929), top: B:398:0x0905 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0538 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x063e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0369 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x03e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0457 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SipStackImpl(Properties properties) {
        this();
        String str;
        String str2;
        boolean z10;
        String str3;
        String property;
        String property2;
        String str4;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String property8;
        boolean z11;
        String property9;
        String property10;
        String property11;
        String property12;
        String property13;
        String property14;
        int i10;
        String property15;
        String property16;
        InputStream resourceAsStream;
        String property17;
        String property18;
        String property19;
        String property20;
        String property21;
        int length;
        int i11;
        Exception e10;
        MergedSystemProperties mergedSystemProperties = new MergedSystemProperties(properties);
        this.configurationProperties = mergedSystemProperties;
        String property22 = mergedSystemProperties.getProperty("android.javax.sip.IP_ADDRESS");
        if (property22 != null) {
            try {
                super.setHostAddress(property22);
            } catch (UnknownHostException unused) {
                throw new n("bad address ".concat(property22));
            }
        }
        String property23 = mergedSystemProperties.getProperty("android.javax.sip.STACK_NAME");
        if (property23 != null) {
            super.setStackName(property23);
            String property24 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.STACK_LOGGER");
            String str5 = property24 == null ? "android.gov.nist.core.LogWriter" : property24;
            try {
                StackLogger stackLogger = (StackLogger) Class.forName(str5).getConstructor(new Class[0]).newInstance(new Object[0]);
                CommonLogger.legacyLogger = stackLogger;
                stackLogger.setStackProperties(mergedSystemProperties);
                String property25 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SERVER_LOGGER");
                try {
                    ServerLogger serverLogger = (ServerLogger) Class.forName(property25 == null ? "android.gov.nist.javax.sip.stack.ServerLog" : property25).getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.serverLogger = serverLogger;
                    serverLogger.setSipStack(this);
                    this.serverLogger.setStackProperties(mergedSystemProperties);
                    super.setReliableConnectionKeepAliveTimeout(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RELIABLE_CONNECTION_KEEP_ALIVE_TIMEOUT", "-1")) * 1000);
                    super.setSslHandshakeTimeout(Long.parseLong(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_HANDSHAKE_TIMEOUT", "-1")));
                    super.setThreadPriority(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_PRIORITY", "10")));
                    this.outboundProxy = mergedSystemProperties.getProperty("android.javax.sip.OUTBOUND_PROXY");
                    ByteBufferFactory.getInstance().setUseDirect(Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.stack.USE_DIRECT_BUFFERS", Boolean.TRUE.toString())).booleanValue());
                    this.defaultRouter = new DefaultRouter(this, this.outboundProxy);
                    String property26 = mergedSystemProperties.getProperty("android.javax.sip.ROUTER_PATH");
                    try {
                        super.setRouter((AbstractC2093c) Class.forName(property26 == null ? "android.gov.nist.javax.sip.stack.DefaultRouter" : property26).getConstructor(r.class, String.class).newInstance(this, this.outboundProxy));
                        String property27 = mergedSystemProperties.getProperty("android.javax.sip.USE_ROUTER_FOR_ALL_URIS");
                        this.useRouterForAll = true;
                        if (property27 != null) {
                            this.useRouterForAll = "true".equalsIgnoreCase(property27);
                        }
                        String property28 = mergedSystemProperties.getProperty("android.javax.sip.EXTENSION_METHODS");
                        if (property28 != null) {
                            StringTokenizer stringTokenizer = new StringTokenizer(property28);
                            while (stringTokenizer.hasMoreTokens()) {
                                String nextToken = stringTokenizer.nextToken(":");
                                if (!nextToken.equalsIgnoreCase(TokenNames.BYE) && !nextToken.equalsIgnoreCase(TokenNames.INVITE) && !nextToken.equalsIgnoreCase(TokenNames.SUBSCRIBE) && !nextToken.equalsIgnoreCase(TokenNames.NOTIFY) && !nextToken.equalsIgnoreCase(TokenNames.ACK) && !nextToken.equalsIgnoreCase(TokenNames.OPTIONS)) {
                                    addExtensionMethod(nextToken);
                                } else {
                                    throw new n("Bad extension method ".concat(nextToken));
                                }
                            }
                        }
                        String property29 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE");
                        if (property29 != null) {
                            this.clientAuth = ClientAuthType.valueOf(property29);
                            logger.logInfo("using " + property29 + " tls auth policy");
                        }
                        String property30 = mergedSystemProperties.getProperty("javax.net.ssl.keyStore");
                        String property31 = mergedSystemProperties.getProperty("javax.net.ssl.trustStore");
                        if (property30 == null) {
                            str = "Cound not instantiate TLS security policy ";
                            str2 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                            str3 = "true";
                            z10 = true;
                        } else {
                            String str6 = property31 == null ? property30 : property31;
                            String property32 = mergedSystemProperties.getProperty("javax.net.ssl.keyStorePassword");
                            String property33 = mergedSystemProperties.getProperty("javax.net.ssl.trustStorePassword", property32);
                            String property34 = mergedSystemProperties.getProperty("javax.net.ssl.keyStoreType");
                            String property35 = mergedSystemProperties.getProperty("javax.net.ssl.trustStoreType");
                            String str7 = property35 == null ? property34 : property35;
                            try {
                                str = "Cound not instantiate TLS security policy ";
                                str3 = "true";
                                str2 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                                z10 = true;
                            } catch (Exception e11) {
                                e10 = e11;
                                str = "Cound not instantiate TLS security policy ";
                                str2 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                                str3 = "true";
                                z10 = true;
                            }
                            try {
                                this.networkLayer = new SslNetworkLayer(this, str6, property30, property32 != null ? property32.toCharArray() : null, property33 != null ? property33.toCharArray() : null, property34, str7);
                            } catch (Exception e12) {
                                e10 = e12;
                                logger.logError("could not instantiate SSL networking", e10);
                                this.isAutomaticDialogSupportEnabled = mergedSystemProperties.getProperty("android.javax.sip.AUTOMATIC_DIALOG_SUPPORT", "on").equalsIgnoreCase("on");
                                this.isAutomaticDialogErrorHandlingEnabled = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTOMATIC_DIALOG_ERROR_HANDLING", str3).equals(Boolean.TRUE.toString());
                                if (this.isAutomaticDialogSupportEnabled) {
                                }
                                if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME") == null) {
                                }
                                if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE") == null) {
                                }
                                if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE") == null) {
                                }
                                setDeliverTerminatedEventForAck(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK", "false").equalsIgnoreCase(str3));
                                super.setDeliverUnsolicitedNotify(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY", "false")));
                                property = mergedSystemProperties.getProperty("android.javax.sip.FORKABLE_EVENTS");
                                if (property != null) {
                                }
                                property2 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_SECURITY_POLICY");
                                if (property2 == null) {
                                }
                                str4 = property2;
                                this.tlsSecurityPolicy = (TlsSecurityPolicy) Class.forName(str4).getConstructor(new Class[0]).newInstance(new Object[0]);
                                if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.NETWORK_LAYER")) {
                                }
                                if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.ADDRESS_RESOLVER")) {
                                }
                                property3 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CONNECTIONS");
                                if (property3 != null) {
                                }
                                property4 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_POOL_SIZE");
                                if (property4 != null) {
                                }
                                int parseInt = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONGESTION_CONTROL_TIMEOUT", "8000"));
                                super.setStackCongestionControlTimeout(parseInt);
                                property5 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TCP_POST_PARSING_THREAD_POOL_SIZE");
                                if (property5 != null) {
                                }
                                property6 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS");
                                if (property6 == null) {
                                }
                                property7 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CLIENT_TRANSACTIONS");
                                if (property7 == null) {
                                }
                                if (!mergedSystemProperties.containsKey("android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER")) {
                                }
                                try {
                                    this.securityManagerProvider.init(mergedSystemProperties);
                                    this.cacheServerConnections = z10;
                                    property8 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS");
                                    if (property8 != null) {
                                    }
                                    z11 = false;
                                    this.cacheClientConnections = z10;
                                    property9 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS");
                                    if (property9 != null) {
                                        this.cacheClientConnections = z11;
                                    }
                                    property10 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.READ_TIMEOUT");
                                    if (property10 != null) {
                                    }
                                    property11 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONNECTION_TIMEOUT");
                                    if (property11 != null) {
                                    }
                                    if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.STUN_SERVER") != null) {
                                    }
                                    property12 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_MESSAGE_SIZE");
                                    try {
                                        if (property12 == null) {
                                        }
                                    } catch (NumberFormatException e13) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("maxMessageSize - bad value " + e13.getMessage());
                                        }
                                    }
                                    String property36 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REENTRANT_LISTENER");
                                    this.reEntrantListener = (property36 != null || !str3.equalsIgnoreCase(property36)) ? false : z10;
                                    property13 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_AUDIT_INTERVAL_IN_MILLISECS");
                                    if (property13 != null) {
                                    }
                                    setNon2XXAckPassedToListener(Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PASS_INVITE_NON_2XX_ACK_TO_LISTENER", "false")).booleanValue());
                                    this.generateTimeStampHeader = Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTO_GENERATE_TIMESTAMP", "false")).booleanValue();
                                    property14 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_FACTORY");
                                    if (property14 == null) {
                                    }
                                    StringMsgParser.setComputeContentLengthFromMessage(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.COMPUTE_CONTENT_LENGTH_FROM_MESSAGE_BODY", "false").equalsIgnoreCase(str3));
                                    property15 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS");
                                    if (property15 != null) {
                                    }
                                    property16 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ENABLED_CIPHER_SUITES");
                                    if (property16 != null) {
                                    }
                                    this.rfc2543Supported = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RFC_2543_SUPPORT_ENABLED", str3).equalsIgnoreCase(str3);
                                    super.setPatchWebSocketHeaders(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PATCH_SIP_WEBSOCKETS_HEADERS", str3))));
                                    super.setPatchRport(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ALWAYS_ADD_RPORT", "false"))));
                                    super.setPatchReceivedRport(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NEVER_ADD_RECEIVED_RPORT", "false")));
                                    this.cancelClientTransactionChecked = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CANCEL_CLIENT_TRANSACTION_CHECKED", str3).equalsIgnoreCase(str3);
                                    this.logStackTraceOnMessageSend = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_STACK_TRACE_ON_MESSAGE_SEND", "false").equalsIgnoreCase(str3);
                                    if (logger.isLoggingEnabled(32)) {
                                    }
                                    resourceAsStream = getClass().getResourceAsStream("/TIMESTAMP");
                                    if (resourceAsStream != null) {
                                    }
                                    Integer num = MAX_DATAGRAM_SIZE;
                                    super.setReceiveUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RECEIVE_UDP_BUFFER_SIZE", num.toString())).intValue());
                                    super.setSendUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SEND_UDP_BUFFER_SIZE", num.toString())).intValue());
                                    super.setConnectionLingerTimer(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LINGER_TIMER", "8")));
                                    Boolean bool = Boolean.FALSE;
                                    this.isBackToBackUserAgent = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.IS_BACK_TO_BACK_USER_AGENT", bool.toString()));
                                    this.checkBranchId = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REJECT_STRAY_RESPONSES", bool.toString()));
                                    this.isDialogTerminatedEventDeliveredForNullDialog = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_NULL_DIALOG", bool.toString()));
                                    this.maxForkTime = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_FORK_TIME_SECONDS", WebrtcBuildVersion.maint_version));
                                    this.earlyDialogTimeout = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.EARLY_DIALOG_TIMEOUT_SECONDS", "180"));
                                    this.minKeepAliveInterval = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MIN_KEEPALIVE_TIME_SECONDS", "-1"));
                                    this.deliverRetransmittedAckToListener = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_RETRANSMITTED_ACK_TO_LISTENER", "false"));
                                    this.dialogTimeoutFactor = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DIALOG_TIMEOUT_FACTOR", "64"));
                                    try {
                                        this.messageParserFactory = (MessageParserFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", StringMsgParserFactory.class.getName())).newInstance();
                                    } catch (Exception e14) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", e14);
                                    }
                                    try {
                                        this.messageProcessorFactory = (MessageProcessorFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", OIOMessageProcessorFactory.class.getName())).newInstance();
                                    } catch (Exception e15) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", e15);
                                    }
                                    property17 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME", "7200000");
                                    try {
                                        this.nioSocketMaxIdleTime = Long.parseLong(property17);
                                    } catch (Exception e16) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME=" + property17, e16);
                                    }
                                    property18 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_BLOCKING_MODE", "BLOCKING");
                                    try {
                                        this.nioMode = NIOMode.valueOf(property18);
                                    } catch (Exception e17) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.NIO_BLOCKING_MODE=" + property18, e17);
                                    }
                                    try {
                                        setTimer((SipTimer) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
                                        getTimer().start(this, mergedSystemProperties);
                                        if (getThreadAuditor() != null) {
                                        }
                                    } catch (Exception e18) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME", e18);
                                    }
                                    if (Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AGGRESSIVE_CLEANUP", Boolean.FALSE.toString()))) {
                                    }
                                    property19 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RELEASE_REFERENCES_STRATEGY");
                                    if (property19 != null) {
                                    }
                                    property20 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", null);
                                    if (property20 != null) {
                                    }
                                    property21 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", null);
                                    if (property21 != null) {
                                    }
                                    setSslRenegotiationEnabled(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_RENEGOTIATION_ENABLED", str3)));
                                    return;
                                } catch (IOException e19) {
                                    throw new j("Cannot initialize security manager provider", e19);
                                } catch (GeneralSecurityException e20) {
                                    throw new j("Cannot initialize security manager provider", e20);
                                }
                            }
                        }
                        this.isAutomaticDialogSupportEnabled = mergedSystemProperties.getProperty("android.javax.sip.AUTOMATIC_DIALOG_SUPPORT", "on").equalsIgnoreCase("on");
                        this.isAutomaticDialogErrorHandlingEnabled = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTOMATIC_DIALOG_ERROR_HANDLING", str3).equals(Boolean.TRUE.toString());
                        if (this.isAutomaticDialogSupportEnabled) {
                            this.isAutomaticDialogErrorHandlingEnabled = z10;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME") == null) {
                            int parseInt2 = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME"));
                            this.maxListenerResponseTime = parseInt2;
                            if (parseInt2 <= 0) {
                                throw new n("Bad configuration parameter android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME : should be positive");
                            }
                        } else {
                            this.maxListenerResponseTime = -1;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE") == null) {
                            this.maxTxLifetimeInvite = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE"));
                            if (super.getMaxTxLifetimeInvite() <= 0) {
                                throw new n("Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE : should be positive");
                            }
                        } else {
                            this.maxTxLifetimeInvite = -1;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE") == null) {
                            this.maxTxLifetimeNonInvite = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE"));
                            if (super.getMaxTxLifetimeNonInvite() <= 0) {
                                throw new n("Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE : should be positive");
                            }
                        } else {
                            this.maxTxLifetimeNonInvite = -1;
                        }
                        setDeliverTerminatedEventForAck(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK", "false").equalsIgnoreCase(str3));
                        super.setDeliverUnsolicitedNotify(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY", "false")));
                        property = mergedSystemProperties.getProperty("android.javax.sip.FORKABLE_EVENTS");
                        if (property != null) {
                            StringTokenizer stringTokenizer2 = new StringTokenizer(property);
                            while (stringTokenizer2.hasMoreTokens()) {
                                this.forkedEvents.add(stringTokenizer2.nextToken());
                            }
                        }
                        property2 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_SECURITY_POLICY");
                        if (property2 == null) {
                            logger.logWarning("using default tls security policy");
                            property2 = "android.gov.nist.javax.sip.stack.DefaultTlsSecurityPolicy";
                        }
                        str4 = property2;
                        try {
                            this.tlsSecurityPolicy = (TlsSecurityPolicy) Class.forName(str4).getConstructor(new Class[0]).newInstance(new Object[0]);
                            if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.NETWORK_LAYER")) {
                                String property37 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NETWORK_LAYER");
                                try {
                                    NetworkLayer networkLayer = (NetworkLayer) Class.forName(property37).getConstructor(new Class[0]).newInstance(new Object[0]);
                                    this.networkLayer = networkLayer;
                                    networkLayer.setSipStack(this);
                                } catch (Exception e21) {
                                    throw new j(a.r("can't find or instantiate NetworkLayer implementation: ", property37), e21);
                                }
                            }
                            if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.ADDRESS_RESOLVER")) {
                                String property38 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ADDRESS_RESOLVER");
                                try {
                                    this.addressResolver = (AddressResolver) Class.forName(property38).getConstructor(new Class[0]).newInstance(new Object[0]);
                                } catch (Exception e22) {
                                    throw new j(a.r("can't find or instantiate AddressResolver implementation: ", property38), e22);
                                }
                            }
                            property3 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CONNECTIONS");
                            if (property3 != null) {
                                try {
                                    this.maxConnections = new Integer(property3).intValue();
                                } catch (NumberFormatException e23) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("max connections - bad value " + e23.getMessage());
                                    }
                                }
                            }
                            property4 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_POOL_SIZE");
                            if (property4 != null) {
                                try {
                                    this.threadPoolSize = new Integer(property4).intValue();
                                } catch (NumberFormatException e24) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("thread pool size - bad value " + e24.getMessage());
                                    }
                                }
                            }
                            int parseInt3 = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONGESTION_CONTROL_TIMEOUT", "8000"));
                            super.setStackCongestionControlTimeout(parseInt3);
                            property5 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TCP_POST_PARSING_THREAD_POOL_SIZE");
                            if (property5 != null) {
                                try {
                                    int intValue = new Integer(property5).intValue();
                                    super.setTcpPostParsingThreadPoolSize(intValue);
                                    PostParseExecutorServices.setPostParseExcutorSize(this, intValue, parseInt3);
                                } catch (NumberFormatException e25) {
                                    if (logger.isLoggingEnabled()) {
                                        StackLogger stackLogger2 = logger;
                                        StringBuilder s10 = android.gov.nist.core.a.s("TCP post-parse thread pool size - bad value ", property5, " : ");
                                        s10.append(e25.getMessage());
                                        stackLogger2.logError(s10.toString());
                                    }
                                }
                            }
                            property6 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS");
                            if (property6 == null) {
                                try {
                                    int intValue2 = new Integer(property6).intValue();
                                    this.serverTransactionTableHighwaterMark = intValue2;
                                    this.serverTransactionTableLowaterMark = (intValue2 * 80) / 100;
                                } catch (NumberFormatException e26) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("transaction table size - bad value " + e26.getMessage());
                                    }
                                }
                            } else {
                                this.unlimitedServerTransactionTableSize = z10;
                            }
                            property7 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CLIENT_TRANSACTIONS");
                            if (property7 == null) {
                                try {
                                    this.clientTransactionTableHiwaterMark = new Integer(property7).intValue();
                                    this.clientTransactionTableLowaterMark = (this.clientTransactionTableLowaterMark * 80) / 100;
                                } catch (NumberFormatException e27) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("transaction table size - bad value " + e27.getMessage());
                                    }
                                }
                            } else {
                                this.unlimitedClientTransactionTableSize = z10;
                            }
                            if (!mergedSystemProperties.containsKey("android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER")) {
                                String property39 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER");
                                try {
                                    this.securityManagerProvider = (SecurityManagerProvider) Class.forName(property39).getConstructor(new Class[0]).newInstance(new Object[0]);
                                } catch (Exception e28) {
                                    throw new j(a.r("can't find or instantiate SecurityManagerProvider implementation: ", property39), e28);
                                }
                            } else {
                                this.securityManagerProvider = new DefaultSecurityManagerProvider();
                            }
                            this.securityManagerProvider.init(mergedSystemProperties);
                            this.cacheServerConnections = z10;
                            property8 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS");
                            if (property8 != null || !"false".equalsIgnoreCase(property8.trim())) {
                                z11 = false;
                            } else {
                                z11 = false;
                                this.cacheServerConnections = false;
                            }
                            this.cacheClientConnections = z10;
                            property9 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS");
                            if (property9 != null && "false".equalsIgnoreCase(property9.trim())) {
                                this.cacheClientConnections = z11;
                            }
                            property10 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.READ_TIMEOUT");
                            if (property10 != null) {
                                try {
                                    int parseInt4 = Integer.parseInt(property10);
                                    if (parseInt4 >= 100) {
                                        this.readTimeout = parseInt4;
                                    } else {
                                        System.err.println("Value too low " + property10);
                                    }
                                } catch (NumberFormatException unused2) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("Bad read timeout ".concat(property10));
                                    }
                                }
                            }
                            property11 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONNECTION_TIMEOUT");
                            if (property11 != null) {
                                try {
                                    int parseInt5 = Integer.parseInt(property11);
                                    if (parseInt5 >= 100) {
                                        this.connTimeout = parseInt5;
                                    } else {
                                        System.err.println("Value too low " + property10);
                                    }
                                } catch (NumberFormatException unused3) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("Bad conn timeout " + property10);
                                    }
                                }
                            }
                            if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.STUN_SERVER") != null) {
                                logger.logWarning("Ignoring obsolete property android.gov.nist.javax.sip.STUN_SERVER");
                            }
                            property12 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_MESSAGE_SIZE");
                            if (property12 == null) {
                                int intValue3 = new Integer(property12).intValue();
                                this.maxMessageSize = intValue3;
                                if (intValue3 < 4096) {
                                    this.maxMessageSize = 4096;
                                }
                            } else {
                                this.maxMessageSize = 0;
                            }
                            String property362 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REENTRANT_LISTENER");
                            this.reEntrantListener = (property362 != null || !str3.equalsIgnoreCase(property362)) ? false : z10;
                            property13 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_AUDIT_INTERVAL_IN_MILLISECS");
                            if (property13 != null) {
                                try {
                                    this.threadAuditor = new ThreadAuditor();
                                    getThreadAuditor().setPingIntervalInMillisecs(Long.valueOf(property13).longValue() / 2);
                                } catch (NumberFormatException e29) {
                                    if (logger.isLoggingEnabled()) {
                                        StackLogger stackLogger3 = logger;
                                        StringBuilder s11 = android.gov.nist.core.a.s("THREAD_AUDIT_INTERVAL_IN_MILLISECS - bad value [", property13, "] ");
                                        s11.append(e29.getMessage());
                                        stackLogger3.logError(s11.toString());
                                    }
                                }
                            }
                            setNon2XXAckPassedToListener(Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PASS_INVITE_NON_2XX_ACK_TO_LISTENER", "false")).booleanValue());
                            this.generateTimeStampHeader = Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTO_GENERATE_TIMESTAMP", "false")).booleanValue();
                            property14 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_FACTORY");
                            if (property14 == null) {
                                try {
                                    i10 = 0;
                                    try {
                                        this.logRecordFactory = (LogRecordFactory) Class.forName(property14).getConstructor(new Class[0]).newInstance(new Object[0]);
                                    } catch (Exception unused4) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Bad configuration value for LOG_FACTORY -- using default logger");
                                        }
                                        this.logRecordFactory = new DefaultMessageLogFactory();
                                        StringMsgParser.setComputeContentLengthFromMessage(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.COMPUTE_CONTENT_LENGTH_FROM_MESSAGE_BODY", "false").equalsIgnoreCase(str3));
                                        property15 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS");
                                        if (property15 != null) {
                                        }
                                        property16 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ENABLED_CIPHER_SUITES");
                                        if (property16 != null) {
                                        }
                                        this.rfc2543Supported = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RFC_2543_SUPPORT_ENABLED", str3).equalsIgnoreCase(str3);
                                        super.setPatchWebSocketHeaders(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PATCH_SIP_WEBSOCKETS_HEADERS", str3))));
                                        super.setPatchRport(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ALWAYS_ADD_RPORT", "false"))));
                                        super.setPatchReceivedRport(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NEVER_ADD_RECEIVED_RPORT", "false")));
                                        this.cancelClientTransactionChecked = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CANCEL_CLIENT_TRANSACTION_CHECKED", str3).equalsIgnoreCase(str3);
                                        this.logStackTraceOnMessageSend = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_STACK_TRACE_ON_MESSAGE_SEND", "false").equalsIgnoreCase(str3);
                                        if (logger.isLoggingEnabled(32)) {
                                        }
                                        resourceAsStream = getClass().getResourceAsStream("/TIMESTAMP");
                                        if (resourceAsStream != null) {
                                        }
                                        Integer num2 = MAX_DATAGRAM_SIZE;
                                        super.setReceiveUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RECEIVE_UDP_BUFFER_SIZE", num2.toString())).intValue());
                                        super.setSendUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SEND_UDP_BUFFER_SIZE", num2.toString())).intValue());
                                        super.setConnectionLingerTimer(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LINGER_TIMER", "8")));
                                        Boolean bool2 = Boolean.FALSE;
                                        this.isBackToBackUserAgent = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.IS_BACK_TO_BACK_USER_AGENT", bool2.toString()));
                                        this.checkBranchId = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REJECT_STRAY_RESPONSES", bool2.toString()));
                                        this.isDialogTerminatedEventDeliveredForNullDialog = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_NULL_DIALOG", bool2.toString()));
                                        this.maxForkTime = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_FORK_TIME_SECONDS", WebrtcBuildVersion.maint_version));
                                        this.earlyDialogTimeout = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.EARLY_DIALOG_TIMEOUT_SECONDS", "180"));
                                        this.minKeepAliveInterval = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MIN_KEEPALIVE_TIME_SECONDS", "-1"));
                                        this.deliverRetransmittedAckToListener = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_RETRANSMITTED_ACK_TO_LISTENER", "false"));
                                        this.dialogTimeoutFactor = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DIALOG_TIMEOUT_FACTOR", "64"));
                                        this.messageParserFactory = (MessageParserFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", StringMsgParserFactory.class.getName())).newInstance();
                                        this.messageProcessorFactory = (MessageProcessorFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", OIOMessageProcessorFactory.class.getName())).newInstance();
                                        property17 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME", "7200000");
                                        this.nioSocketMaxIdleTime = Long.parseLong(property17);
                                        property18 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_BLOCKING_MODE", "BLOCKING");
                                        this.nioMode = NIOMode.valueOf(property18);
                                        setTimer((SipTimer) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
                                        getTimer().start(this, mergedSystemProperties);
                                        if (getThreadAuditor() != null) {
                                            getTimer().schedule(new SIPTransactionStack.PingTimer(null), 0L);
                                        }
                                        if (Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AGGRESSIVE_CLEANUP", Boolean.FALSE.toString()))) {
                                        }
                                        property19 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RELEASE_REFERENCES_STRATEGY");
                                        if (property19 != null) {
                                        }
                                        property20 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", null);
                                        if (property20 != null) {
                                            String[] split = property20.split(Separators.COMMA);
                                            length = split.length;
                                            while (i11 < length) {
                                            }
                                        }
                                        property21 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", null);
                                        if (property21 != null) {
                                            try {
                                                this.sipEventInterceptor = (SIPEventInterceptor) Class.forName(property21).newInstance();
                                                new Thread() { // from class: android.gov.nist.javax.sip.SipStackImpl.1
                                                    @Override // java.lang.Thread, java.lang.Runnable
                                                    public void run() {
                                                        try {
                                                            Thread.sleep(100L);
                                                            SipStackImpl.this.sipEventInterceptor.init(this);
                                                        } catch (Exception e30) {
                                                            SipStackImpl.logger.logError("Error intializing SIPEventInterceptor", e30);
                                                        }
                                                    }
                                                }.start();
                                            } catch (Exception e30) {
                                                logger.logError("Bad configuration value for android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", e30);
                                            }
                                        }
                                        setSslRenegotiationEnabled(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_RENEGOTIATION_ENABLED", str3)));
                                        return;
                                    }
                                } catch (Exception unused5) {
                                    i10 = 0;
                                }
                            } else {
                                i10 = 0;
                                this.logRecordFactory = new DefaultMessageLogFactory();
                            }
                            StringMsgParser.setComputeContentLengthFromMessage(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.COMPUTE_CONTENT_LENGTH_FROM_MESSAGE_BODY", "false").equalsIgnoreCase(str3));
                            property15 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS");
                            if (property15 != null) {
                                StringTokenizer stringTokenizer3 = new StringTokenizer(property15, "\" ,");
                                String[] strArr = new String[stringTokenizer3.countTokens()];
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("TLS Client Protocols = ");
                                }
                                int i12 = i10;
                                while (stringTokenizer3.hasMoreTokens()) {
                                    strArr[i12] = stringTokenizer3.nextToken();
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("TLS Client Protocol = " + strArr[i12]);
                                    }
                                    i12++;
                                }
                                this.enabledProtocols = strArr;
                            }
                            property16 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ENABLED_CIPHER_SUITES");
                            if (property16 != null) {
                                StringTokenizer stringTokenizer4 = new StringTokenizer(property16, "\" ,");
                                String[] strArr2 = new String[stringTokenizer4.countTokens()];
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Cipher Suites = ");
                                }
                                int i13 = i10;
                                while (stringTokenizer4.hasMoreTokens()) {
                                    strArr2[i13] = stringTokenizer4.nextToken();
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Cipher Suite = " + strArr2[i13]);
                                    }
                                    i13++;
                                }
                                this.cipherSuites = strArr2;
                            }
                            this.rfc2543Supported = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RFC_2543_SUPPORT_ENABLED", str3).equalsIgnoreCase(str3);
                            super.setPatchWebSocketHeaders(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PATCH_SIP_WEBSOCKETS_HEADERS", str3))));
                            super.setPatchRport(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ALWAYS_ADD_RPORT", "false"))));
                            super.setPatchReceivedRport(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NEVER_ADD_RECEIVED_RPORT", "false")));
                            this.cancelClientTransactionChecked = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CANCEL_CLIENT_TRANSACTION_CHECKED", str3).equalsIgnoreCase(str3);
                            this.logStackTraceOnMessageSend = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_STACK_TRACE_ON_MESSAGE_SEND", "false").equalsIgnoreCase(str3);
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("created Sip stack. Properties = " + mergedSystemProperties);
                            }
                            resourceAsStream = getClass().getResourceAsStream("/TIMESTAMP");
                            if (resourceAsStream != null) {
                                try {
                                    String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                                    resourceAsStream.close();
                                    logger.setBuildTimeStamp(readLine);
                                } catch (IOException unused6) {
                                    logger.logError("Could not open build timestamp.");
                                }
                            }
                            Integer num22 = MAX_DATAGRAM_SIZE;
                            super.setReceiveUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RECEIVE_UDP_BUFFER_SIZE", num22.toString())).intValue());
                            super.setSendUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SEND_UDP_BUFFER_SIZE", num22.toString())).intValue());
                            super.setConnectionLingerTimer(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LINGER_TIMER", "8")));
                            Boolean bool22 = Boolean.FALSE;
                            this.isBackToBackUserAgent = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.IS_BACK_TO_BACK_USER_AGENT", bool22.toString()));
                            this.checkBranchId = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REJECT_STRAY_RESPONSES", bool22.toString()));
                            this.isDialogTerminatedEventDeliveredForNullDialog = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_NULL_DIALOG", bool22.toString()));
                            this.maxForkTime = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_FORK_TIME_SECONDS", WebrtcBuildVersion.maint_version));
                            this.earlyDialogTimeout = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.EARLY_DIALOG_TIMEOUT_SECONDS", "180"));
                            this.minKeepAliveInterval = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MIN_KEEPALIVE_TIME_SECONDS", "-1"));
                            this.deliverRetransmittedAckToListener = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_RETRANSMITTED_ACK_TO_LISTENER", "false"));
                            this.dialogTimeoutFactor = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DIALOG_TIMEOUT_FACTOR", "64"));
                            this.messageParserFactory = (MessageParserFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", StringMsgParserFactory.class.getName())).newInstance();
                            this.messageProcessorFactory = (MessageProcessorFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", OIOMessageProcessorFactory.class.getName())).newInstance();
                            property17 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME", "7200000");
                            this.nioSocketMaxIdleTime = Long.parseLong(property17);
                            property18 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_BLOCKING_MODE", "BLOCKING");
                            this.nioMode = NIOMode.valueOf(property18);
                            setTimer((SipTimer) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
                            getTimer().start(this, mergedSystemProperties);
                            if (getThreadAuditor() != null && getThreadAuditor().isEnabled()) {
                                getTimer().schedule(new SIPTransactionStack.PingTimer(null), 0L);
                            }
                            if (Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AGGRESSIVE_CLEANUP", Boolean.FALSE.toString()))) {
                                setReleaseReferencesStrategy(ReleaseReferencesStrategy.Normal);
                            }
                            property19 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RELEASE_REFERENCES_STRATEGY");
                            if (property19 != null) {
                                setReleaseReferencesStrategy(ReleaseReferencesStrategy.valueOf(property19));
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Using following release references strategy " + getReleaseReferencesStrategy());
                                }
                            }
                            property20 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", null);
                            if (property20 != null && !property20.equals("")) {
                                String[] split2 = property20.split(Separators.COMMA);
                                length = split2.length;
                                for (i11 = i10; i11 < length; i11++) {
                                    try {
                                        SIPMessageValve sIPMessageValve = (SIPMessageValve) Class.forName(split2[i11]).newInstance();
                                        try {
                                            Thread.sleep(100L);
                                            sIPMessageValve.init(this);
                                        } catch (Exception e31) {
                                            logger.logError("Error intializing SIPMessageValve", e31);
                                        }
                                        this.sipMessageValves.add(sIPMessageValve);
                                    } catch (Exception e32) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", e32);
                                    }
                                }
                            }
                            property21 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", null);
                            if (property21 != null && !property21.equals("")) {
                                this.sipEventInterceptor = (SIPEventInterceptor) Class.forName(property21).newInstance();
                                new Thread() { // from class: android.gov.nist.javax.sip.SipStackImpl.1
                                    @Override // java.lang.Thread, java.lang.Runnable
                                    public void run() {
                                        try {
                                            Thread.sleep(100L);
                                            SipStackImpl.this.sipEventInterceptor.init(this);
                                        } catch (Exception e302) {
                                            SipStackImpl.logger.logError("Error intializing SIPEventInterceptor", e302);
                                        }
                                    }
                                }.start();
                            }
                            setSslRenegotiationEnabled(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_RENEGOTIATION_ENABLED", str3)));
                            return;
                        } catch (InvocationTargetException e33) {
                            throw new IllegalArgumentException(android.gov.nist.core.a.A(str, str4, str2), e33);
                        } catch (Exception e34) {
                            throw new IllegalArgumentException(android.gov.nist.core.a.A(str, str4, str2), e34);
                        }
                    } catch (InvocationTargetException e35) {
                        logger.logError("could not instantiate router -- invocation target problem", (Exception) e35.getCause());
                        throw new j("Cound not instantiate router - check constructor", e35);
                    } catch (Exception e36) {
                        logger.logError("could not instantiate router", (Exception) e36.getCause());
                        throw new j("Could not instantiate router", e36);
                    }
                } catch (InvocationTargetException e37) {
                    throw new IllegalArgumentException(android.gov.nist.core.a.A("Cound not instantiate server logger ", str5, "- check that it is present on the classpath and that there is a no-args constructor defined"), e37);
                } catch (Exception e38) {
                    throw new IllegalArgumentException(android.gov.nist.core.a.A("Cound not instantiate server logger ", str5, "- check that it is present on the classpath and that there is a no-args constructor defined"), e38);
                }
            } catch (InvocationTargetException e39) {
                throw new IllegalArgumentException(android.gov.nist.core.a.A("Cound not instantiate stack logger ", str5, "- check that it is present on the classpath and that there is a no-args constructor defined"), e39);
            } catch (Exception e40) {
                throw new IllegalArgumentException(android.gov.nist.core.a.A("Cound not instantiate stack logger ", str5, "- check that it is present on the classpath and that there is a no-args constructor defined"), e40);
            }
        }
        throw new n("stack name is missing");
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public h createListeningPoint(int i10, String str) {
        String str2 = this.stackAddress;
        if (str2 != null) {
            return createListeningPoint(str2, i10, str);
        }
        throw new NullPointerException("Stack does not have a default IP Address!");
    }
}

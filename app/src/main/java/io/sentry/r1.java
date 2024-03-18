package io.sentry;

import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public class r1 {
    static final EnumC3642e1 DEFAULT_DIAGNOSTIC_LEVEL = EnumC3642e1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachThreads;
    private AbstractC3654i1 beforeBreadcrumb;
    private AbstractC3657j1 beforeEnvelopeCallback;
    private AbstractC3660k1 beforeSend;
    private AbstractC3663l1 beforeSendTransaction;
    private String cacheDirPath;
    private boolean debug;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableExternalConfiguration;
    private Boolean enableTracing;
    private String environment;
    private final List<r> eventProcessors;
    private P executorService;
    private final List<X> integrations;
    private Double profilesSampleRate;
    private AbstractC3669n1 profilesSampler;
    private String proguardUuid;
    private o1 proxy;
    private String release;
    private Double sampleRate;
    private io.sentry.protocol.q sdkVersion;
    private String sentryClientName;
    private String serverName;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private Double tracesSampleRate;
    private q1 tracesSampler;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;
    private H logger = C3683s0.f34720Y;
    private EnumC3642e1 diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
    private E envelopeReader = new C3672p(new C3659k0(this));
    private Q serializer = new C3659k0(this);
    private int maxDepth = 100;
    private int maxCacheItems = 30;
    private int maxQueueSize = 30;
    private int maxBreadcrumbs = 100;
    private final List<String> inAppExcludes = new CopyOnWriteArrayList();
    private final List<String> inAppIncludes = new CopyOnWriteArrayList();
    private V transportFactory = C3691w0.f34801a;
    private io.sentry.transport.i transportGate = io.sentry.transport.e.f34742Z;
    private boolean attachStacktrace = true;
    private boolean enableAutoSessionTracking = true;
    private long sessionTrackingIntervalMillis = 30000;
    private boolean attachServerName = true;
    private boolean enableUncaughtExceptionHandler = true;
    private boolean printUncaughtStackTrace = false;
    private int connectionTimeoutMillis = 5000;
    private int readTimeoutMillis = 5000;
    private io.sentry.cache.d envelopeDiskCache = io.sentry.transport.j.f34748Y;
    private boolean sendDefaultPii = false;
    private final List<O> observers = new CopyOnWriteArrayList();
    private final List<J> optionsObservers = new CopyOnWriteArrayList();
    private final Map<String, String> tags = new ConcurrentHashMap();
    private long maxAttachmentSize = 20971520;
    private boolean enableDeduplication = true;
    private int maxSpans = 1000;
    private boolean enableShutdownHook = true;
    private p1 maxRequestBodySize = p1.NONE;
    private boolean traceSampling = true;
    private long maxTraceFileSize = 5242880;
    private U transactionProfiler = C3689v0.f34782a;
    private List<String> tracePropagationTargets = null;
    private final List<String> defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
    private Long idleTimeout = 3000L;
    private final List<String> contextTags = new CopyOnWriteArrayList();
    private boolean sendClientReports = true;
    io.sentry.clientreport.f clientReportRecorder = new io.sentry.clientreport.c(this);
    private io.sentry.internal.modules.a modulesLoader = io.sentry.internal.modules.e.f34400a;
    private io.sentry.internal.debugmeta.a debugMetaLoader = io.sentry.internal.debugmeta.b.f34386Y;
    private boolean enableUserInteractionTracing = false;
    private boolean enableUserInteractionBreadcrumbs = true;
    private W instrumenter = W.SENTRY;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators = new ArrayList();
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters = new ArrayList();
    private io.sentry.util.thread.a mainThreadChecker = io.sentry.util.thread.c.f34780Y;
    private boolean traceOptionsRequests = true;
    private S0 dateProvider = new N0(0);
    private final List<K> performanceCollectors = new ArrayList();
    private K1 transactionPerformanceCollector = C3680q0.f34687d;
    private boolean enableTimeToFullDisplayTracing = false;
    private final C3684t fullyDisplayedReporter = C3684t.f34722b;
    private D connectionStatusProvider = new Object();
    private boolean enabled = true;
    private boolean enablePrettySerializationOutput = true;
    private boolean sendModules = true;
    private boolean enableSpotlight = false;
    private boolean enableScopePersistence = true;
    private List<String> ignoredCheckIns = null;
    private io.sentry.backpressure.a backpressureMonitor = io.sentry.backpressure.b.f34278Y;
    private boolean enableBackpressureHandling = false;
    private boolean enableAppStartProfiling = false;
    private boolean enableMetrics = false;
    private int profilingTracesHz = 101;
    private C3666m1 cron = null;

    /* JADX WARN: Type inference failed for: r5v16, types: [io.sentry.D, java.lang.Object] */
    public r1(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.executorService = C3680q0.f34685b;
        if (!z10) {
            this.executorService = new C3609a1();
            copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
            copyOnWriteArrayList2.add(new ShutdownHookIntegration());
            copyOnWriteArrayList2.add(new SpotlightIntegration());
            copyOnWriteArrayList.add(new C3662l0(this));
            copyOnWriteArrayList.add(new C3655j(this, 1));
            if (!io.sentry.util.d.f34775a) {
                copyOnWriteArrayList.add(new C3655j());
            }
            setSentryClientName("sentry.java/7.5.0");
            io.sentry.protocol.q qVar = new io.sentry.protocol.q("sentry.java", "7.5.0");
            qVar.f34608Z = "7.5.0";
            setSdkVersion(qVar);
            C3636c1.l().c("maven:io.sentry:sentry");
        }
    }

    public static r1 empty() {
        return new r1(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                this.bundleIds.add(trim);
            }
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(r rVar) {
        this.eventProcessors.add(rVar);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(X x10) {
        this.integrations.add(x10);
    }

    public void addOptionsObserver(J j6) {
        this.optionsObservers.add(j6);
    }

    public void addPerformanceCollector(K k10) {
        this.performanceCollectors.add(k10);
    }

    public void addScopeObserver(O o10) {
        this.observers.add(o10);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.tracePropagationTargets.add(str);
        }
    }

    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public io.sentry.backpressure.a getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public AbstractC3654i1 getBeforeBreadcrumb() {
        return null;
    }

    public AbstractC3657j1 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public AbstractC3660k1 getBeforeSend() {
        return this.beforeSend;
    }

    public AbstractC3663l1 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str != null && !str.isEmpty()) {
            if (this.dsnHash != null) {
                return new File(this.cacheDirPath, this.dsnHash).getAbsolutePath();
            }
            return this.cacheDirPath;
        }
        return null;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str != null && !str.isEmpty()) {
            return this.cacheDirPath;
        }
        return null;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public D getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public C3666m1 getCron() {
        return this.cron;
    }

    public S0 getDateProvider() {
        return this.dateProvider;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC3642e1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public E getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        String str = this.environment;
        if (str == null) {
            return DEFAULT_ENVIRONMENT;
        }
        return str;
    }

    public List<r> getEventProcessors() {
        return this.eventProcessors;
    }

    public P getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C3684t getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public W getInstrumenter() {
        return this.instrumenter;
    }

    public List<X> getIntegrations() {
        return this.integrations;
    }

    public H getLogger() {
        return this.logger;
    }

    public io.sentry.util.thread.a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public p1 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public List<J> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<K> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public AbstractC3669n1 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public o1 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<O> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.q getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public Q getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        if (list == null) {
            return this.defaultTracePropagationTargets;
        }
        return list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public q1 getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public K1 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public U getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public V getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.i getTransportGate() {
        return this.transportGate;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        if (isProfilingEnabled() && this.enableAppStartProfiling) {
            return true;
        }
        return false;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() == null) {
            getTracesSampler();
            return false;
        }
        return true;
    }

    public void merge(C3682s c3682s) {
        String str = c3682s.f34694a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c3682s.f34695b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c3682s.f34696c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c3682s.f34697d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c3682s.f34698e;
        if (str5 != null) {
            setServerName(str5);
        }
        o1 o1Var = c3682s.f34706m;
        if (o1Var != null) {
            setProxy(o1Var);
        }
        Boolean bool = c3682s.f34699f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c3682s.f34714u;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Boolean bool3 = c3682s.f34702i;
        if (bool3 != null) {
            setEnableTracing(bool3);
        }
        Double d10 = c3682s.f34703j;
        if (d10 != null) {
            setTracesSampleRate(d10);
        }
        Double d11 = c3682s.f34704k;
        if (d11 != null) {
            setProfilesSampleRate(d11);
        }
        Boolean bool4 = c3682s.f34700g;
        if (bool4 != null) {
            setDebug(bool4.booleanValue());
        }
        Boolean bool5 = c3682s.f34701h;
        if (bool5 != null) {
            setEnableDeduplication(bool5.booleanValue());
        }
        Boolean bool6 = c3682s.f34715v;
        if (bool6 != null) {
            setSendClientReports(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c3682s.f34705l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c3682s.f34708o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c3682s.f34707n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c3682s.f34713t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c3682s.f34709p != null) {
            setTracePropagationTargets(new ArrayList(c3682s.f34709p));
        }
        Iterator it4 = new ArrayList(c3682s.f34710q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c3682s.f34711r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l10 = c3682s.f34712s;
        if (l10 != null) {
            setIdleTimeout(l10);
        }
        Iterator it5 = c3682s.f34716w.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c3682s.f34717x;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c3682s.f34718y;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c3682s.f34691A;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c3682s.f34719z != null) {
            setIgnoredCheckIns(new ArrayList(c3682s.f34719z));
        }
        Boolean bool10 = c3682s.f34692B;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        if (c3682s.f34693C != null) {
            if (getCron() == null) {
                setCron(c3682s.f34693C);
                return;
            }
            if (c3682s.f34693C.f34424a != null) {
                getCron().f34424a = c3682s.f34693C.f34424a;
            }
            if (c3682s.f34693C.f34425b != null) {
                getCron().f34425b = c3682s.f34693C.f34425b;
            }
            if (c3682s.f34693C.f34426c != null) {
                getCron().f34426c = c3682s.f34693C.f34426c;
            }
            if (c3682s.f34693C.f34427d != null) {
                getCron().f34427d = c3682s.f34693C.f34427d;
            }
            if (c3682s.f34693C.f34428e != null) {
                getCron().f34428e = c3682s.f34693C.f34428e;
            }
        }
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.a aVar) {
        this.backpressureMonitor = aVar;
    }

    public void setBeforeBreadcrumb(AbstractC3654i1 abstractC3654i1) {
    }

    public void setBeforeEnvelopeCallback(AbstractC3657j1 abstractC3657j1) {
        this.beforeEnvelopeCallback = abstractC3657j1;
    }

    public void setBeforeSend(AbstractC3660k1 abstractC3660k1) {
        this.beforeSend = abstractC3660k1;
    }

    public void setBeforeSendTransaction(AbstractC3663l1 abstractC3663l1) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(D d10) {
        this.connectionStatusProvider = d10;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setCron(C3666m1 c3666m1) {
        this.cron = c3666m1;
    }

    public void setDateProvider(S0 s02) {
        this.dateProvider = s02;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.f34386Y;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDiagnosticLevel(EnumC3642e1 enumC3642e1) {
        if (enumC3642e1 == null) {
            enumC3642e1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC3642e1;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        H h10 = this.logger;
        Charset charset = io.sentry.util.e.f34777a;
        String str2 = null;
        if (str != null && !str.isEmpty()) {
            try {
                str2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(io.sentry.util.e.f34777a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                h10.d(EnumC3642e1.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                h10.f(EnumC3642e1.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        this.dsnHash = str2;
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnableMetrics(boolean z10) {
        this.enableMetrics = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.j.f34748Y;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(E e10) {
        if (e10 == null) {
            e10 = C3680q0.f34684a;
        }
        this.envelopeReader = e10;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(P p10) {
        if (p10 != null) {
            this.executorService = p10;
        }
    }

    public void setFlushTimeoutMillis(long j6) {
        this.flushTimeoutMillis = j6;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(W w10) {
        this.instrumenter = w10;
    }

    public void setLogger(H h10) {
        H h11;
        if (h10 == null) {
            h11 = C3683s0.f34720Y;
        } else {
            h11 = new C3664m(this, h10);
        }
        this.logger = h11;
    }

    public void setMainThreadChecker(io.sentry.util.thread.a aVar) {
        this.mainThreadChecker = aVar;
    }

    public void setMaxAttachmentSize(long j6) {
        this.maxAttachmentSize = j6;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(p1 p1Var) {
        this.maxRequestBodySize = p1Var;
    }

    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j6) {
        this.maxTraceFileSize = j6;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.f34400a;
        }
        this.modulesLoader = aVar;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfilesSampleRate(Double d10) {
        if (AbstractC4344b.B0(d10, true)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(AbstractC3669n1 abstractC3669n1) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z10) {
        Double d10;
        if (getProfilesSampleRate() == null) {
            if (z10) {
                d10 = Double.valueOf(1.0d);
            } else {
                d10 = null;
            }
            setProfilesSampleRate(d10);
        }
    }

    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(o1 o1Var) {
        this.proxy = o1Var;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d10) {
        if (AbstractC4344b.B0(d10, true)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.q qVar) {
        this.sdkVersion = qVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, io.sentry.clientreport.f] */
    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.c(this);
        } else {
            this.clientReportRecorder = new Object();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(Q q10) {
        if (q10 == null) {
            q10 = C3680q0.f34686c;
        }
        this.serializer = q10;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j6) {
        this.sessionFlushTimeoutMillis = j6;
    }

    public void setSessionTrackingIntervalMillis(long j6) {
        this.sessionTrackingIntervalMillis = j6;
    }

    @Deprecated
    public void setShutdownTimeout(long j6) {
        this.shutdownTimeoutMillis = j6;
    }

    public void setShutdownTimeoutMillis(long j6) {
        this.shutdownTimeoutMillis = j6;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(Double d10) {
        if (AbstractC4344b.B0(d10, true)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(q1 q1Var) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(K1 k12) {
        this.transactionPerformanceCollector = k12;
    }

    public void setTransactionProfiler(U u10) {
        if (this.transactionProfiler == C3689v0.f34782a && u10 != null) {
            this.transactionProfiler = u10;
        }
    }

    public void setTransportFactory(V v10) {
        if (v10 == null) {
            v10 = C3691w0.f34801a;
        }
        this.transportFactory = v10;
    }

    public void setTransportGate(io.sentry.transport.i iVar) {
        if (iVar == null) {
            iVar = io.sentry.transport.e.f34742Z;
        }
        this.transportGate = iVar;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}

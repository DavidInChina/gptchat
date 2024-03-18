package com.statsig.androidsdk;

import Ad.l;
import I8.n;
import Ng.C;
import Ng.D;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.N;
import com.statsig.androidsdk.KeyType;
import id.AbstractC3557B;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b\u001d\u0010\u001eJS\u0010%\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001e\b\u0002\u0010$\u001a\u0018\u0012\f\u0012\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\u0004\u0012\u00020\u0004\u0018\u00010!2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b%\u0010&J9\u0010)\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010'2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010*J_\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010'2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2&\u0010$\u001a\"\b\u0001\u0012\b\u0012\u00060\"j\u0002`#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0006\u0012\u0004\u0018\u00010\u00010+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010,J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b-\u0010\u0006R\"\u0010/\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0013R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u00100R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u00104R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u000705j\b\u0012\u0004\u0012\u00020\u0007`68\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u00109\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/statsig/androidsdk/ErrorBoundary;", "", "", "exception", "Ljf/y;", "handleException", "(Ljava/lang/Throwable;)V", "", ParameterNames.TAG, "configName", "startMarker", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "markerID", "", "success", "endMarker", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "apiKey", "setKey", "(Ljava/lang/String;)V", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "setMetadata", "(Lcom/statsig/androidsdk/StatsigMetadata;)V", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "setDiagnostics", "(Lcom/statsig/androidsdk/Diagnostics;)V", "LNg/D;", "getExceptionHandler", "()LNg/D;", "Lkotlin/Function0;", "task", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "recover", "capture", "(Lwf/a;Ljava/lang/String;Lwf/k;Ljava/lang/String;)V", TokenNames.T, "Lnf/e;", "captureAsync", "(Lwf/k;Lnf/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "(Lwf/k;Lwf/n;Lnf/e;)Ljava/lang/Object;", "logException$build_release", "logException", "urlString", "Ljava/lang/String;", "getUrlString$build_release", "()Ljava/lang/String;", "setUrlString$build_release", "Lcom/statsig/androidsdk/StatsigMetadata;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "seen", "Ljava/util/HashSet;", "Lcom/statsig/androidsdk/Diagnostics;", "<init>", "()V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ErrorBoundary {
    private String apiKey;
    private Diagnostics diagnostics;
    private StatsigMetadata statsigMetadata;
    private String urlString = "https://statsigapi.net/v1/sdk_exception";
    private HashSet<String> seen = new HashSet<>();

    public static /* synthetic */ void capture$default(ErrorBoundary errorBoundary, AbstractC6216a abstractC6216a, String str, k kVar, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        errorBoundary.capture(abstractC6216a, str, kVar, str2);
    }

    private final void endMarker(String str, String str2, boolean z10, String str3) {
        String str4;
        Diagnostics diagnostics = this.diagnostics;
        KeyType.Companion companion = KeyType.Companion;
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        KeyType convertFromString = companion.convertFromString(str4);
        if (str != null && diagnostics != null && convertFromString != null) {
            Diagnostics.markEnd$default(diagnostics, convertFromString, z10, null, new Marker(null, null, null, null, null, null, null, null, null, null, str2, null, null, null, str3, null, null, null, 244735, null), null, 16, null);
        }
    }

    public final void handleException(Throwable th2) {
        PrintStream printStream = System.out;
        printStream.println((Object) "[Statsig]: An unexpected exception occurred.");
        printStream.println(th2);
        if (!(th2 instanceof ExternalException)) {
            logException$build_release(th2);
        }
    }

    private final String startMarker(String str, String str2) {
        String str3;
        Diagnostics diagnostics = this.diagnostics;
        KeyType.Companion companion = KeyType.Companion;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        KeyType convertFromString = companion.convertFromString(str3);
        if (str != null && diagnostics != null && convertFromString != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) str);
            sb2.append('_');
            ContextType contextType = ContextType.API_CALL;
            sb2.append(diagnostics.getMarkers(contextType).size());
            String sb3 = sb2.toString();
            diagnostics.setDiagnosticsContext(contextType);
            Diagnostics.markStart$default(diagnostics, convertFromString, null, new Marker(null, null, null, null, null, null, null, null, null, null, sb3, null, null, null, str2, null, null, null, 244735, null), null, 8, null);
            return sb3;
        }
        return null;
    }

    public final void capture(AbstractC6216a abstractC6216a, String str, k kVar, String str2) {
        AbstractC3557B.c0("task", abstractC6216a);
        String str3 = "";
        try {
            String startMarker = startMarker(str, str2);
            if (startMarker != null) {
                str3 = startMarker;
            }
            abstractC6216a.mo122invoke();
            endMarker(str, str3, true, str2);
        } catch (Exception e10) {
            endMarker(str, str3, false, str2);
            handleException(e10);
            if (kVar != null) {
                kVar.invoke(e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object captureAsync(k kVar, AbstractC4825e abstractC4825e) {
        ErrorBoundary$captureAsync$1 errorBoundary$captureAsync$1;
        int i10;
        Exception e10;
        ErrorBoundary errorBoundary;
        if (abstractC4825e instanceof ErrorBoundary$captureAsync$1) {
            errorBoundary$captureAsync$1 = (ErrorBoundary$captureAsync$1) abstractC4825e;
            int i11 = errorBoundary$captureAsync$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                errorBoundary$captureAsync$1.label = i11 - Integer.MIN_VALUE;
                Object obj = errorBoundary$captureAsync$1.result;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = errorBoundary$captureAsync$1.label;
                if (i10 != 0) {
                    N.B0(obj);
                    try {
                        errorBoundary$captureAsync$1.L$0 = this;
                        errorBoundary$captureAsync$1.label = 1;
                        Object invoke = kVar.invoke(errorBoundary$captureAsync$1);
                        return invoke == obj2 ? obj2 : invoke;
                    } catch (Exception e11) {
                        e10 = e11;
                        errorBoundary = this;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    errorBoundary = (ErrorBoundary) errorBoundary$captureAsync$1.L$0;
                    try {
                        N.B0(obj);
                        return obj;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                errorBoundary.handleException(e10);
                return null;
            }
        }
        errorBoundary$captureAsync$1 = new ErrorBoundary$captureAsync$1(this, abstractC4825e);
        Object obj3 = errorBoundary$captureAsync$1.result;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = errorBoundary$captureAsync$1.label;
        if (i10 != 0) {
        }
        errorBoundary.handleException(e10);
        return null;
    }

    public final D getExceptionHandler() {
        return new ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(C.f12863Y, this);
    }

    public final String getUrlString$build_release() {
        return this.urlString;
    }

    public final void logException$build_release(Throwable th2) {
        AbstractC3557B.c0("exception", th2);
        try {
            if (this.apiKey == null) {
                return;
            }
            String canonicalName = th2.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th2.getClass().getName();
            }
            if (this.seen.contains(canonicalName)) {
                return;
            }
            this.seen.add(canonicalName);
            StatsigMetadata statsigMetadata = this.statsigMetadata;
            if (statsigMetadata == null) {
                statsigMetadata = new StatsigMetadata("", null, null, null, null, null, null, null, null, null, null, 2046, null);
            }
            URL url = new URL(this.urlString);
            String i10 = new n().i(AbstractC4268D.a1(new C3959i("exception", canonicalName), new C3959i(ParameterNames.INFO, P4.a.I0(new RuntimeException(th2))), new C3959i("statsigMetadata", statsigMetadata)));
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json");
                httpURLConnection.setRequestProperty("STATSIG-API-KEY", this.apiKey);
                httpURLConnection.setUseCaches(false);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(i10);
                l.S(dataOutputStream, null);
                httpURLConnection.getResponseCode();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Exception unused) {
        }
    }

    public final void setDiagnostics(Diagnostics diagnostics) {
        AbstractC3557B.c0("diagnostics", diagnostics);
        this.diagnostics = diagnostics;
        if (Math.floor(Math.random() * ((double) ErrorBoundaryKt.SAMPLING_RATE)) == 0.0d) {
            diagnostics.setMaxMarkers(ContextType.API_CALL, 30);
        } else {
            diagnostics.setMaxMarkers(ContextType.API_CALL, 0);
        }
    }

    public final void setKey(String str) {
        AbstractC3557B.c0("apiKey", str);
        this.apiKey = str;
    }

    public final void setMetadata(StatsigMetadata statsigMetadata) {
        AbstractC3557B.c0("statsigMetadata", statsigMetadata);
        this.statsigMetadata = statsigMetadata;
    }

    public final void setUrlString$build_release(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.urlString = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v6 java.lang.Object), (r8v1 java.lang.Object), (r8v1 java.lang.Object) binds: [B:25:0x0061, B:20:0x004e, B:16:0x003b, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object captureAsync(k kVar, wf.n nVar, AbstractC4825e abstractC4825e) {
        ErrorBoundary$captureAsync$2 errorBoundary$captureAsync$2;
        int i10;
        Exception e10;
        ErrorBoundary errorBoundary;
        if (abstractC4825e instanceof ErrorBoundary$captureAsync$2) {
            errorBoundary$captureAsync$2 = (ErrorBoundary$captureAsync$2) abstractC4825e;
            int i11 = errorBoundary$captureAsync$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                errorBoundary$captureAsync$2.label = i11 - Integer.MIN_VALUE;
                Object obj = errorBoundary$captureAsync$2.result;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = errorBoundary$captureAsync$2.label;
                if (i10 != 0) {
                    N.B0(obj);
                    try {
                        errorBoundary$captureAsync$2.L$0 = this;
                        errorBoundary$captureAsync$2.L$1 = nVar;
                        errorBoundary$captureAsync$2.label = 1;
                        obj = kVar.invoke(errorBoundary$captureAsync$2);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        errorBoundary = this;
                        errorBoundary.handleException(e10);
                        errorBoundary$captureAsync$2.L$0 = null;
                        errorBoundary$captureAsync$2.L$1 = null;
                        errorBoundary$captureAsync$2.label = 2;
                        obj = nVar.invoke(e10, errorBoundary$captureAsync$2);
                        if (obj != obj2) {
                        }
                    }
                } else if (i10 == 1) {
                    nVar = (wf.n) errorBoundary$captureAsync$2.L$1;
                    errorBoundary = (ErrorBoundary) errorBoundary$captureAsync$2.L$0;
                    try {
                        N.B0(obj);
                    } catch (Exception e12) {
                        e10 = e12;
                        errorBoundary.handleException(e10);
                        errorBoundary$captureAsync$2.L$0 = null;
                        errorBoundary$captureAsync$2.L$1 = null;
                        errorBoundary$captureAsync$2.label = 2;
                        obj = nVar.invoke(e10, errorBoundary$captureAsync$2);
                        return obj != obj2 ? obj2 : obj;
                    }
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    N.B0(obj);
                }
            }
        }
        errorBoundary$captureAsync$2 = new ErrorBoundary$captureAsync$2(this, abstractC4825e);
        Object obj3 = errorBoundary$captureAsync$2.result;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = errorBoundary$captureAsync$2.label;
        if (i10 != 0) {
        }
    }
}

package com.google.android.gms.internal.play_billing;

import Z.AbstractC1725n;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.AbstractC2549y;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import fe.C3027e;
import fe.C3028f;
import g3.AbstractC3170m;
import g3.C3159b;
import g3.C3169l;
import h.C3276b;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import j2.AbstractC3899a;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import s3.C5562l;
import te.C5760d;

/* renamed from: com.google.android.gms.internal.play_billing.q0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2469q0 {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "NEVER";
                }
                return "RARE";
            }
            return "AVERAGE";
        }
        return "FREQUENT";
    }

    public static List a(io.sentry.config.d dVar, String str) {
        String a5 = dVar.a(str);
        if (a5 != null) {
            return Arrays.asList(a5.split(Separators.COMMA));
        }
        return Collections.emptyList();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x8.K, java.lang.Object, x8.H] */
    public static C3159b b(AbstractC3170m abstractC3170m, byte[] bArr, int i10, int i11) {
        x8.L l10 = x8.N.f49523Z;
        ?? h10 = new x8.H();
        abstractC3170m.f(bArr, i10, i11, C3169l.f31187c, new C3276b(17, h10));
        return new C3159b(h10.i0());
    }

    public static Object c(int i10, AbstractC2543v abstractC2543v) {
        if (i10 != 1) {
            if (i10 != 2) {
                return abstractC2543v.n();
            }
            return abstractC2543v.E();
        }
        return abstractC2543v.D();
    }

    public static /* synthetic */ long d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 0L;
                    }
                    throw null;
                }
                return 1000L;
            }
            return 500L;
        }
        return 100L;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return AbstractC2549y.q0(i10) + i11 + i12 + i13;
    }

    public static int f(AbstractC3899a abstractC3899a, int i10, int i11) {
        return (abstractC3899a.hashCode() + i10) * i11;
    }

    public static C3288a g(Tc.f fVar, int i10, AbstractC1725n abstractC1725n, int i11) {
        return R4.b.X(abstractC1725n, i11, new F9.f(fVar, i10));
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.y());
        return sb2.toString();
    }

    public static String i(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String j(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static List k(String str, String str2) {
        return AbstractC4344b.F0(new C3028f(str, str2));
    }

    public static List l(String str, String str2, String str3) {
        return AbstractC4344b.F0(new C3027e(str, str2, str3));
    }

    public static AbstractC4326r m(String str, y.L l10, String str2, C5562l c5562l, String str3) {
        AbstractC3557B.c0(str, l10);
        AbstractC3557B.c0(str2, c5562l);
        return io.sentry.compose.b.a(str3);
    }

    public static /* synthetic */ void n(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static /* synthetic */ void o(X x10) {
        if (x10 == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static /* synthetic */ void q(String str, int i10) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC3557B.s0(str));
        AbstractC3557B.r2(AbstractC3557B.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void r(Map map, String str, C3636c1 c3636c1, String str2, io.sentry.H h10) {
        Object obj = map.get(str);
        c3636c1.n(str2);
        c3636c1.v(h10, obj);
    }

    public static void s(kotlin.jvm.internal.D d10, Class cls, Type type, Df.w wVar, C5760d c5760d) {
        c5760d.b(R4.b.n2(type, d10.b(cls), wVar));
    }

    public static void t(Object[] objArr, int i10, String str, LogIntent logIntent) {
        LogWrapperKt.log(logIntent, String.format(str, Arrays.copyOf(objArr, i10)));
    }

    public static /* synthetic */ void u(String str, int i10) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(android.gov.nist.core.a.g(str, " must not be null"));
        AbstractC3557B.r2(AbstractC3557B.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static /* synthetic */ String v(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String w(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "INVALID_PAYLOAD";
                }
                return "FATAL_ERROR";
            }
            return "TRANSIENT_ERROR";
        }
        return "OK";
    }

    public static /* synthetic */ String x(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i10) {
        switch (i10) {
            case 1:
                return "BEACON";
            case 2:
                return "FETCH";
            case 3:
                return "XHR";
            case 4:
                return "DOCUMENT";
            case 5:
                return "NATIVE";
            case 6:
                return "UNKNOWN";
            case 7:
                return "IMAGE";
            case 8:
                return "JS";
            case 9:
                return "FONT";
            case 10:
                return "CSS";
            case 11:
                return "MEDIA";
            case 12:
                return "OTHER";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                return "null";
        }
    }
}

package s3;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: s3.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5550M extends T {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f45259l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5550M(int i10) {
        super(true);
        this.f45259l = i10;
    }

    public static float[] f(String str) {
        return new float[]{((Number) T.f45269f.c(str)).floatValue()};
    }

    public static int[] g(String str) {
        return new int[]{((Number) T.f45265b.c(str)).intValue()};
    }

    public static long[] h(String str) {
        return new long[]{((Number) T.f45267d.c(str)).longValue()};
    }

    public static boolean[] i(String str) {
        return new boolean[]{((Boolean) T.f45271h.c(str)).booleanValue()};
    }

    @Override // s3.T
    public final Object a(Bundle bundle, String str) {
        int i10 = this.f45259l;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (boolean[]) bundle.get(str);
            case 1:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (Boolean) bundle.get(str);
            case 2:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (float[]) bundle.get(str);
            case 3:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                Object obj = bundle.get(str);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj);
                return (Float) obj;
            case 4:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (int[]) bundle.get(str);
            case 5:
                switch (i10) {
                    case 5:
                        AbstractC3557B.c0("bundle", bundle);
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                        Object obj2 = bundle.get(str);
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj2);
                        return (Integer) obj2;
                    default:
                        AbstractC3557B.c0("bundle", bundle);
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                        Object obj3 = bundle.get(str);
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj3);
                        return (Integer) obj3;
                }
            case 6:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (long[]) bundle.get(str);
            case 7:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                Object obj4 = bundle.get(str);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Long", obj4);
                return (Long) obj4;
            case 8:
            default:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (String) bundle.get(str);
            case 9:
                AbstractC3557B.c0("bundle", bundle);
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return (String[]) bundle.get(str);
        }
    }

    @Override // s3.T
    public final String b() {
        switch (this.f45259l) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
            default:
                return "string";
            case 9:
                return "string[]";
        }
    }

    @Override // s3.T
    public final Object c(String str) {
        int i10;
        int i11;
        String str2;
        long j6;
        int i12 = this.f45259l;
        boolean z10 = true;
        switch (i12) {
            case 0:
                return i(str);
            case 1:
                if (!AbstractC3557B.K(str, "true")) {
                    if (AbstractC3557B.K(str, "false")) {
                        z10 = false;
                    } else {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                return f(str);
            case 3:
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                return g(str);
            case 5:
                switch (i12) {
                    case 5:
                        if (Lg.n.I2(str, "0x", false)) {
                            String substring = str.substring(2);
                            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                            K4.J.j(16);
                            i10 = Integer.parseInt(substring, 16);
                        } else {
                            i10 = Integer.parseInt(str);
                        }
                        return Integer.valueOf(i10);
                    default:
                        if (Lg.n.I2(str, "0x", false)) {
                            String substring2 = str.substring(2);
                            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
                            K4.J.j(16);
                            i11 = Integer.parseInt(substring2, 16);
                        } else {
                            i11 = Integer.parseInt(str);
                        }
                        return Integer.valueOf(i11);
                }
            case 6:
                return h(str);
            case 7:
                if (Lg.n.c2(str, TokenNames.f24315L, false)) {
                    str2 = str.substring(0, str.length() - 1);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str2);
                } else {
                    str2 = str;
                }
                if (Lg.n.I2(str, "0x", false)) {
                    String substring3 = str2.substring(2);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring3);
                    K4.J.j(16);
                    j6 = Long.parseLong(substring3, 16);
                } else {
                    j6 = Long.parseLong(str2);
                }
                return Long.valueOf(j6);
            case 8:
            default:
                if (AbstractC3557B.K(str, "null")) {
                    return null;
                }
                return str;
            case 9:
                return new String[]{str};
        }
    }

    @Override // s3.T
    public final Object d(String str, Object obj) {
        switch (this.f45259l) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] i10 = i(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(i10, 0, copyOf, length, 1);
                    AbstractC3557B.Z(copyOf);
                    return copyOf;
                }
                return i(str);
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] f6 = f(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(f6, 0, copyOf2, length2, 1);
                    AbstractC3557B.Z(copyOf2);
                    return copyOf2;
                }
                return f(str);
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] g10 = g(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(g10, 0, copyOf3, length3, 1);
                    AbstractC3557B.Z(copyOf3);
                    return copyOf3;
                }
                return g(str);
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] h10 = h(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(h10, 0, copyOf4, length4, 1);
                    AbstractC3557B.Z(copyOf4);
                    return copyOf4;
                }
                return h(str);
            case 9:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    AbstractC3557B.Z(copyOf5);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                return c(str);
        }
    }

    @Override // s3.T
    public final void e(Bundle bundle, String str, Object obj) {
        int i10 = this.f45259l;
        switch (i10) {
            case 0:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putBoolean(str, booleanValue);
                return;
            case 2:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putFloat(str, floatValue);
                return;
            case 4:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putIntArray(str, (int[]) obj);
                return;
            case 5:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 5:
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                        bundle.putInt(str, intValue);
                        return;
                    default:
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                        bundle.putInt(str, intValue);
                        return;
                }
            case 6:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putLongArray(str, (long[]) obj);
                return;
            case 7:
                long longValue = ((Number) obj).longValue();
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putLong(str, longValue);
                return;
            case 8:
            default:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putString(str, (String) obj);
                return;
            case 9:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                bundle.putStringArray(str, (String[]) obj);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5550M(int i10, int i11) {
        super(false);
        this.f45259l = i10;
    }
}

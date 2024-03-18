package B2;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaDrmException;
import android.util.Log;
import android.view.View;
import g3.AbstractC3170m;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k3.C4157b;
import l3.C4334a;
import m3.C4556e;
import n3.C4714a;
import p2.C5065s;
import s3.AbstractC5540C;
import s3.C5552b;
import s3.V;
import s3.X;
import u3.AbstractC5830c;
import x2.AbstractC6267b;
import y3.AbstractC6539a;
import z2.C6755D;

/* loaded from: classes2.dex */
public class u implements y, M5.j, AbstractC5830c, AbstractC6539a {

    /* renamed from: Y  reason: collision with root package name */
    public static Field f1818Y;

    /* renamed from: Z  reason: collision with root package name */
    public static boolean f1819Z;

    public static void s(x3.w wVar, Object[] objArr) {
        long j6;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                wVar.s0(i10);
            } else if (obj instanceof byte[]) {
                wVar.b0(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                wVar.D(i10, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                wVar.D(i10, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                wVar.T(i10, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                wVar.T(i10, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                wVar.T(i10, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                wVar.T(i10, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                wVar.b(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j6 = 1;
                } else {
                    j6 = 0;
                }
                wVar.T(i10, j6);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }
    }

    public static AbstractC3170m t(C5065s c5065s) {
        String str = c5065s.f42319q0;
        if (str != null) {
            char c10 = '\uffff';
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            List list = c5065s.f42321s0;
            switch (c10) {
                case 0:
                    return new i3.h(list);
                case 1:
                    return new U3.i(7);
                case 2:
                    return new L2.y(1);
                case 3:
                    return new C3636c1(7);
                case 4:
                    return new C4714a(list);
                case 5:
                    return new C4157b(list);
                case 6:
                    return new C4334a();
                case 7:
                    return new C4556e();
            }
        }
        throw new IllegalArgumentException(R.a.r("Unsupported MIME type: ", str));
    }

    public static String u(String str) {
        if (str != null) {
            return "android-app://androidx.navigation/".concat(str);
        }
        return "";
    }

    public static boolean v(String str, String str2) {
        AbstractC3557B.c0("current", str);
        if (AbstractC3557B.K(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    return AbstractC3557B.K(Lg.n.U2(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String w(Context context, int i10) {
        String str;
        AbstractC3557B.c0("context", context);
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            str = context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            str = String.valueOf(i10);
        }
        AbstractC3557B.b0("try {\n                co\u2026.toString()\n            }", str);
        return str;
    }

    public static Kg.k x(AbstractC5540C abstractC5540C) {
        AbstractC3557B.c0("<this>", abstractC5540C);
        return Kg.p.c1(abstractC5540C, C5552b.f45288n0);
    }

    public static String y(Class cls) {
        LinkedHashMap linkedHashMap = X.f45278b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            V v10 = (V) cls.getAnnotation(V.class);
            if (v10 != null) {
                str = v10.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        AbstractC3557B.Z(str);
        return str;
    }

    public boolean A(C5065s c5065s) {
        String str = c5065s.f42319q0;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // B2.y
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // B2.y
    public x e() {
        throw new IllegalStateException();
    }

    @Override // u3.AbstractC5830c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // B2.y
    public AbstractC6267b g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // u3.AbstractC5830c
    public void h(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            AbstractC3612c.d("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // B2.y
    public byte[] i() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // B2.y
    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // M5.j
    public M5.i l() {
        return new M5.i();
    }

    @Override // B2.y
    public byte[] m(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // B2.y
    public void n(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // B2.y
    public w o(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // y3.AbstractC6539a
    public void p(B3.b bVar) {
        C3.b bVar2 = (C3.b) bVar;
        bVar2.t("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        bVar2.Y("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    @Override // B2.y
    public int q() {
        return 1;
    }

    @Override // B2.y
    public boolean r(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public void z(View view, int i10) {
        if (!f1819Z) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1818Y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1819Z = true;
        }
        Field field = f1818Y;
        if (field != null) {
            try {
                f1818Y.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // B2.y
    public void release() {
    }

    @Override // M5.j
    public void a(Context context) {
    }

    @Override // B2.y
    public void d(J0.a aVar) {
    }

    @Override // B2.y
    public void k(byte[] bArr) {
    }

    @Override // B2.y
    public /* synthetic */ void c(byte[] bArr, C6755D c6755d) {
    }
}

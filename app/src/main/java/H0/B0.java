package H0;

import A.AbstractC0044t0;
import S0.AbstractC1355p;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k6.AbstractC4194d;
import nf.AbstractC4830j;

/* loaded from: classes2.dex */
public final class B0 implements AbstractC4830j, AbstractC1355p {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ B0 f6714Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final j1 f6715Z = new Object();

    public static final boolean a() {
        Object obj;
        Class cls = C0714y.f7071z1;
        try {
            if (C0714y.f7071z1 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C0714y.f7071z1 = cls2;
                C0714y.f7070A1 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C0714y.f7070A1;
            Boolean bool = null;
            if (method != null) {
                obj = method.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int b(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        if (i10 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Can't represent a size of ", i10, " in Constraints"));
    }

    public static long c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        long j6;
        int i16;
        if (i13 == Integer.MAX_VALUE) {
            i14 = i12;
        } else {
            i14 = i13;
        }
        int b10 = b(i14);
        if (i11 == Integer.MAX_VALUE) {
            i15 = i10;
        } else {
            i15 = i11;
        }
        int b11 = b(i15);
        if (b10 + b11 <= 31) {
            if (b11 != 13) {
                if (b11 != 18) {
                    if (b11 != 15) {
                        if (b11 == 16) {
                            j6 = 0;
                        } else {
                            throw new IllegalStateException("Should only have the provided constants.");
                        }
                    } else {
                        j6 = 2;
                    }
                } else {
                    j6 = 1;
                }
            } else {
                j6 = 3;
            }
            int i17 = 0;
            if (i11 == Integer.MAX_VALUE) {
                i16 = 0;
            } else {
                i16 = i11 + 1;
            }
            if (i13 != Integer.MAX_VALUE) {
                i17 = i13 + 1;
            }
            int i18 = Z0.a.f22779b[(int) j6];
            return (i16 << 33) | j6 | (i10 << 2) | (i12 << i18) | (i17 << (i18 + 31));
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("Can't represent a width of ", i15, " and height of ", i14, " in Constraints"));
    }

    public static long d(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            return c(i10, i10, i11, i11);
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("width(", i10, ") and height(", i11, ") must be >= 0").toString());
    }

    public static boolean e(int i10) {
        int type = Character.getType(i10);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static void f(View view) {
        try {
            if (!c1.f6915z0) {
                c1.f6915z0 = true;
                if (Build.VERSION.SDK_INT < 28) {
                    c1.f6913x0 = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    c1.f6914y0 = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    c1.f6913x0 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    c1.f6914y0 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = c1.f6913x0;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = c1.f6914y0;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = c1.f6914y0;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = c1.f6913x0;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            c1.f6911A0 = true;
        }
    }
}

package sg;

import android.gov.nist.core.Separators;
import kg.C4290b;
import kg.C4291c;

/* renamed from: sg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5625b {

    /* renamed from: a  reason: collision with root package name */
    public final String f45577a;

    public C5625b(String str) {
        if (str != null) {
            this.f45577a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 != 3) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    } else {
                        objArr[1] = "getInternalName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
            } else {
                objArr[1] = "getFqNameForClassNameWithoutDollars";
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static C5625b b(C4290b c4290b) {
        C4291c g10 = c4290b.g();
        String replace = c4290b.h().b().replace('.', '$');
        if (g10.d()) {
            return new C5625b(replace);
        }
        return new C5625b(g10.b().replace('.', '/') + Separators.SLASH + replace);
    }

    public static C5625b c(C4291c c4291c) {
        if (c4291c != null) {
            return new C5625b(c4291c.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static C5625b d(String str) {
        if (str != null) {
            return new C5625b(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f45577a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5625b.class == obj.getClass()) {
            return this.f45577a.equals(((C5625b) obj).f45577a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45577a.hashCode();
    }

    public final String toString() {
        return this.f45577a;
    }
}

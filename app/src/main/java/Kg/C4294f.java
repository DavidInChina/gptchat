package kg;

import android.gov.nist.core.Separators;

/* renamed from: kg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4294f implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final String f37507Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f37508Z;

    public C4294f(String str, boolean z10) {
        if (str != null) {
            this.f37507Y = str;
            this.f37508Z = z10;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            objArr[0] = "name";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                } else {
                    objArr[1] = "asStringStripSpecialMarkers";
                }
            } else {
                objArr[1] = "getIdentifier";
            }
        } else {
            objArr[1] = "asString";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static C4294f d(String str) {
        if (str != null) {
            if (str.startsWith(Separators.LESS_THAN)) {
                return g(str);
            }
            return e(str);
        }
        a(9);
        throw null;
    }

    public static C4294f e(String str) {
        if (str != null) {
            return new C4294f(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith(Separators.LESS_THAN)) {
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        a(6);
        throw null;
    }

    public static C4294f g(String str) {
        if (str != null) {
            if (str.startsWith(Separators.LESS_THAN)) {
                return new C4294f(str, true);
            }
            throw new IllegalArgumentException("special name must start with '<': ".concat(str));
        }
        a(8);
        throw null;
    }

    public final String b() {
        String str = this.f37507Y;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (!this.f37508Z) {
            String b10 = b();
            if (b10 != null) {
                return b10;
            }
            a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37507Y.compareTo(((C4294f) obj).f37507Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4294f)) {
            return false;
        }
        C4294f c4294f = (C4294f) obj;
        if (this.f37508Z == c4294f.f37508Z && this.f37507Y.equals(c4294f.f37507Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37507Y.hashCode() * 31) + (this.f37508Z ? 1 : 0);
    }

    public final String toString() {
        return this.f37507Y;
    }
}

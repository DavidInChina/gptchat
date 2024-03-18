package kg;

/* renamed from: kg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4291c {

    /* renamed from: c  reason: collision with root package name */
    public static final C4291c f37496c = new C4291c("");

    /* renamed from: a  reason: collision with root package name */
    public final C4293e f37497a;

    /* renamed from: b  reason: collision with root package name */
    public transient C4291c f37498b;

    public C4291c(String str) {
        if (str != null) {
            this.f37497a = new C4293e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C4291c j(C4294f c4294f) {
        if (c4294f != null) {
            if (c4294f != null) {
                return new C4291c(new C4293e(c4294f.b(), f37496c.i(), c4294f));
            }
            C4293e.a(17);
            throw null;
        }
        a(14);
        throw null;
    }

    public final String b() {
        String str = this.f37497a.f37503a;
        if (str != null) {
            return str;
        }
        C4293e.a(4);
        throw null;
    }

    public final C4291c c(C4294f c4294f) {
        if (c4294f != null) {
            return new C4291c(this.f37497a.b(c4294f), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f37497a.f37503a.isEmpty();
    }

    public final C4291c e() {
        C4291c c4291c = this.f37498b;
        if (c4291c != null) {
            if (c4291c != null) {
                return c4291c;
            }
            a(6);
            throw null;
        } else if (!d()) {
            C4293e c4293e = this.f37497a;
            C4293e c4293e2 = c4293e.f37505c;
            if (c4293e2 == null) {
                if (!c4293e.f37503a.isEmpty()) {
                    c4293e.c();
                    c4293e2 = c4293e.f37505c;
                    if (c4293e2 == null) {
                        C4293e.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            C4291c c4291c2 = new C4291c(c4293e2);
            this.f37498b = c4291c2;
            return c4291c2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4291c) && this.f37497a.equals(((C4291c) obj).f37497a)) {
            return true;
        }
        return false;
    }

    public final C4294f f() {
        C4294f f6 = this.f37497a.f();
        if (f6 != null) {
            return f6;
        }
        a(9);
        throw null;
    }

    public final C4294f g() {
        C4294f c4294f;
        C4293e c4293e = this.f37497a;
        if (c4293e.f37503a.isEmpty()) {
            c4294f = C4293e.f37500e;
            if (c4294f == null) {
                C4293e.a(12);
                throw null;
            }
        } else {
            c4294f = c4293e.f();
            if (c4294f == null) {
                C4293e.a(13);
                throw null;
            }
        }
        return c4294f;
    }

    public final boolean h(C4294f c4294f) {
        if (c4294f != null) {
            String str = this.f37497a.f37503a;
            if (str.isEmpty()) {
                return false;
            }
            int indexOf = str.indexOf(46);
            String b10 = c4294f.b();
            if (indexOf == -1) {
                indexOf = Math.max(str.length(), b10.length());
            }
            return str.regionMatches(0, b10, 0, indexOf);
        }
        a(12);
        throw null;
    }

    public final int hashCode() {
        return this.f37497a.f37503a.hashCode();
    }

    public final C4293e i() {
        C4293e c4293e = this.f37497a;
        if (c4293e != null) {
            return c4293e;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f37497a.toString();
    }

    public C4291c(C4293e c4293e) {
        if (c4293e != null) {
            this.f37497a = c4293e;
        } else {
            a(2);
            throw null;
        }
    }

    public C4291c(C4293e c4293e, C4291c c4291c) {
        this.f37497a = c4293e;
        this.f37498b = c4291c;
    }
}

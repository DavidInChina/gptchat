package kg;

import android.gov.nist.core.Separators;

/* renamed from: kg.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4290b {

    /* renamed from: a  reason: collision with root package name */
    public final C4291c f37493a;

    /* renamed from: b  reason: collision with root package name */
    public final C4291c f37494b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37495c;

    public C4290b(C4291c c4291c, C4291c c4291c2, boolean z10) {
        if (c4291c != null) {
            this.f37493a = c4291c;
            this.f37494b = c4291c2;
            this.f37495c = z10;
            return;
        }
        a(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                switch (i10) {
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 3:
                        objArr[0] = "packageFqName";
                        break;
                    case 2:
                        objArr[0] = "relativeClassName";
                        break;
                    case 4:
                        objArr[0] = "topLevelName";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = "name";
                        break;
                    case 10:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = "string";
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i10 == 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                switch (i10) {
                                    case 13:
                                    case 14:
                                        objArr[1] = "asString";
                                        break;
                                    case 15:
                                    case 16:
                                        objArr[1] = "asFqNameString";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                                        break;
                                }
                            } else {
                                objArr[1] = "asSingleFqName";
                            }
                        } else {
                            objArr[1] = "getShortClassName";
                        }
                    } else {
                        objArr[1] = "getRelativeClassName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[2] = "<init>";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case 10:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                    switch (i10) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 5) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 5) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 5) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 5) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 5) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static C4290b e(String str, boolean z10) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(Separators.SLASH);
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace('/', '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new C4290b(new C4291c(str2), new C4291c(str), z10);
        }
        a(12);
        throw null;
    }

    public static C4290b j(C4291c c4291c) {
        if (c4291c != null) {
            return new C4290b(c4291c.e(), c4291c.f());
        }
        a(0);
        throw null;
    }

    public final C4291c b() {
        C4291c c4291c = this.f37493a;
        boolean d10 = c4291c.d();
        C4291c c4291c2 = this.f37494b;
        if (d10) {
            if (c4291c2 != null) {
                return c4291c2;
            }
            a(9);
            throw null;
        }
        return new C4291c(c4291c.b() + Separators.DOT + c4291c2.b());
    }

    public final String c() {
        C4291c c4291c;
        boolean d10 = this.f37493a.d();
        C4291c c4291c2 = this.f37494b;
        if (d10) {
            String b10 = c4291c2.b();
            if (b10 != null) {
                return b10;
            }
            a(13);
            throw null;
        }
        String str = c4291c.b().replace('.', '/') + Separators.SLASH + c4291c2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final C4290b d(C4294f c4294f) {
        if (c4294f != null) {
            return new C4290b(g(), this.f37494b.c(c4294f), this.f37495c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4290b.class != obj.getClass()) {
            return false;
        }
        C4290b c4290b = (C4290b) obj;
        if (this.f37493a.equals(c4290b.f37493a) && this.f37494b.equals(c4290b.f37494b) && this.f37495c == c4290b.f37495c) {
            return true;
        }
        return false;
    }

    public final C4290b f() {
        C4291c e10 = this.f37494b.e();
        if (e10.d()) {
            return null;
        }
        return new C4290b(g(), e10, this.f37495c);
    }

    public final C4291c g() {
        C4291c c4291c = this.f37493a;
        if (c4291c != null) {
            return c4291c;
        }
        a(5);
        throw null;
    }

    public final C4291c h() {
        C4291c c4291c = this.f37494b;
        if (c4291c != null) {
            return c4291c;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.f37494b.hashCode();
        return Boolean.valueOf(this.f37495c).hashCode() + ((hashCode + (this.f37493a.hashCode() * 31)) * 31);
    }

    public final C4294f i() {
        C4294f f6 = this.f37494b.f();
        if (f6 != null) {
            return f6;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        if (this.f37493a.d()) {
            return Separators.SLASH + c();
        }
        return c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4290b(C4291c c4291c, C4294f c4294f) {
        this(c4291c, C4291c.j(c4294f), false);
        if (c4291c == null) {
            a(3);
            throw null;
        } else if (c4294f != null) {
        } else {
            a(4);
            throw null;
        }
    }
}

package ng;

/* renamed from: ng.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4845l {

    /* renamed from: b  reason: collision with root package name */
    public static final C4845l f40353b = new C4845l(1, "SUCCESS");

    /* renamed from: a  reason: collision with root package name */
    public final int f40354a;

    public C4845l(int i10, String str) {
        if (i10 != 0) {
            this.f40354a = i10;
        } else {
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        String format;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
            } else {
                objArr[0] = "success";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                if (i10 != 2) {
                    if (i10 == 3 || i10 == 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "conflict";
                }
            } else {
                objArr[2] = "incompatible";
            }
            format = String.format(str, objArr);
            if (i10 != 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "debugMessage";
        switch (i10) {
        }
        if (i10 == 1) {
        }
        format = String.format(str, objArr);
        if (i10 != 1) {
        }
        throw new IllegalArgumentException(format);
    }

    public static C4845l b(String str) {
        return new C4845l(3, str);
    }

    public static C4845l d(String str) {
        return new C4845l(2, str);
    }

    public final int c() {
        int i10 = this.f40354a;
        if (i10 != 0) {
            return i10;
        }
        a(5);
        throw null;
    }
}

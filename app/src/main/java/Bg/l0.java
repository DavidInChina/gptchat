package Bg;

/* loaded from: classes2.dex */
public final class l0 extends r {

    /* renamed from: Z  reason: collision with root package name */
    public final String f2135Z;

    public l0(String str) {
        this.f2135Z = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void K0(int i10) {
        String str;
        int i11;
        String format;
        if (i10 != 1 && i10 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 4) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        objArr[0] = "newAttributes";
                    }
                } else {
                    objArr[0] = "kotlinTypeRefiner";
                }
            } else {
                objArr[0] = "delegate";
            }
            if (i10 == 1) {
                if (i10 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
            } else {
                objArr[1] = "toString";
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            objArr[2] = "replaceAttributes";
                        }
                    } else {
                        objArr[2] = "refine";
                    }
                } else {
                    objArr[2] = "replaceDelegate";
                }
            }
            format = String.format(str, objArr);
            if (i10 != 1 || i10 == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        if (i10 == 1) {
        }
        if (i10 != 1) {
        }
        format = String.format(str, objArr);
        if (i10 != 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // Bg.r, Bg.A
    public final A A0(Cg.i iVar) {
        if (iVar != null) {
            return this;
        }
        K0(3);
        throw null;
    }

    @Override // Bg.D, Bg.o0
    public final /* bridge */ /* synthetic */ o0 C0(boolean z10) {
        F0(z10);
        throw null;
    }

    @Override // Bg.r, Bg.o0
    public final o0 D0(Cg.i iVar) {
        if (iVar != null) {
            return this;
        }
        K0(3);
        throw null;
    }

    @Override // Bg.D, Bg.o0
    public final /* bridge */ /* synthetic */ o0 E0(Q q10) {
        G0(q10);
        throw null;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        throw new IllegalStateException(this.f2135Z);
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        if (q10 == null) {
            K0(0);
            throw null;
        }
        throw new IllegalStateException(this.f2135Z);
    }

    @Override // Bg.r
    public final D H0() {
        throw new IllegalStateException(this.f2135Z);
    }

    @Override // Bg.r
    public final D I0(Cg.i iVar) {
        if (iVar != null) {
            return this;
        }
        K0(3);
        throw null;
    }

    @Override // Bg.r
    public final r J0(D d10) {
        throw new IllegalStateException(this.f2135Z);
    }

    @Override // Bg.D
    public final String toString() {
        String str = this.f2135Z;
        if (str != null) {
            return str;
        }
        K0(1);
        throw null;
    }
}

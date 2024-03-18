package Nf;

/* loaded from: classes.dex */
public abstract class b implements a {

    /* renamed from: Y  reason: collision with root package name */
    public final i f12802Y;

    public b(i iVar) {
        if (iVar != null) {
            this.f12802Y = iVar;
        } else {
            C(0);
            throw null;
        }
    }

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Nf.a
    public i getAnnotations() {
        i iVar = this.f12802Y;
        if (iVar != null) {
            return iVar;
        }
        C(1);
        throw null;
    }
}

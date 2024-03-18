package eg;

/* renamed from: eg.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2897e extends AbstractC2894b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29392b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2896d f29393c;

    public /* synthetic */ C2897e(C2896d c2896d, int i10) {
        this.f29392b = i10;
        this.f29393c = c2896d;
    }

    @Override // eg.AbstractC2894b
    public final void f(String[] strArr) {
        int i10 = this.f29392b;
        C2896d c2896d = this.f29393c;
        switch (i10) {
            case 0:
                if (strArr != null) {
                    c2896d.f29391b.f29400e = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
            default:
                if (strArr != null) {
                    c2896d.f29391b.f29401f = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
    }
}

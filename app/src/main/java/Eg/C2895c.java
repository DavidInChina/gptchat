package eg;

import dg.y;

/* renamed from: eg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2895c extends AbstractC2894b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29388b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f29389c;

    public /* synthetic */ C2895c(y yVar, int i10) {
        this.f29388b = i10;
        this.f29389c = yVar;
    }

    @Override // eg.AbstractC2894b
    public final void f(String[] strArr) {
        int i10 = this.f29388b;
        y yVar = this.f29389c;
        switch (i10) {
            case 0:
                if (strArr != null) {
                    ((C2896d) yVar).f29391b.f29400e = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
            case 1:
                if (strArr != null) {
                    ((C2896d) yVar).f29391b.f29401f = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
            default:
                if (strArr != null) {
                    ((C2896d) yVar).f29391b.f29404i = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
    }
}

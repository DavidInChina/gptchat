package z;

import id.AbstractC3557B;

/* renamed from: z.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6709l0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f51313Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f51314Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6706k f51315h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6716p f51316i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f51317j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6709l0(kotlin.jvm.internal.B b10, float f6, AbstractC6706k abstractC6706k, C6716p c6716p, wf.k kVar) {
        super(1);
        this.f51313Y = b10;
        this.f51314Z = f6;
        this.f51315h0 = abstractC6706k;
        this.f51316i0 = c6716p;
        this.f51317j0 = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f51313Y.f37622Y;
        AbstractC3557B.Z(obj2);
        AbstractC6696f.o((C6712n) obj2, longValue, this.f51314Z, this.f51315h0, this.f51316i0, this.f51317j0);
        return jf.y.f36177a;
    }
}

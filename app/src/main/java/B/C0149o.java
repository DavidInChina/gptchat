package B;

import java.io.Serializable;
import q0.C5251c;

/* renamed from: B.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1424Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f1425Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Serializable f1426h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149o(Object obj, Serializable serializable, int i10) {
        super(2);
        this.f1424Y = i10;
        this.f1425Z = obj;
        this.f1426h0 = serializable;
    }

    public final void a(float f6, float f10) {
        int i10 = this.f1424Y;
        Object obj = this.f1425Z;
        Serializable serializable = this.f1426h0;
        switch (i10) {
            case 0:
                H h10 = ((C) obj).f1039a;
                h10.f1088h.i(f6);
                h10.f1089i.i(f10);
                ((kotlin.jvm.internal.y) serializable).f37646Y = f6;
                return;
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) serializable;
                float f11 = yVar.f37646Y;
                yVar.f37646Y = ((AbstractC0130h1) obj).a(f6 - f11) + f11;
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f1424Y) {
            case 0:
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return yVar;
            case 1:
                B0.u uVar = (B0.u) obj;
                long j6 = ((C5251c) obj2).f43623a;
                C0.e.a((C0.d) this.f1425Z, uVar);
                uVar.a();
                ((kotlin.jvm.internal.A) this.f1426h0).f37621Y = j6;
                return yVar;
            default:
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149o(kotlin.jvm.internal.y yVar, AbstractC0130h1 abstractC0130h1) {
        super(2);
        this.f1424Y = 2;
        this.f1426h0 = yVar;
        this.f1425Z = abstractC0130h1;
    }
}

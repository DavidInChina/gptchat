package Wd;

import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class b extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f20922Z = new b(0);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20923Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f20923Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f20923Y;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                switch (i10) {
                    case 0:
                        z10 = hVar instanceof e;
                        break;
                    case 1:
                        z10 = hVar instanceof d;
                        break;
                    default:
                        z10 = hVar instanceof d;
                        break;
                }
                return Boolean.valueOf(z10);
            case 1:
                h hVar2 = (h) obj;
                switch (i10) {
                    case 0:
                        z11 = hVar2 instanceof e;
                        break;
                    case 1:
                        z11 = hVar2 instanceof d;
                        break;
                    default:
                        z11 = hVar2 instanceof d;
                        break;
                }
                return Boolean.valueOf(z11);
            default:
                h hVar3 = (h) obj;
                switch (i10) {
                    case 0:
                        z12 = hVar3 instanceof e;
                        break;
                    case 1:
                        z12 = hVar3 instanceof d;
                        break;
                    default:
                        z12 = hVar3 instanceof d;
                        break;
                }
                return Boolean.valueOf(z12);
        }
    }
}

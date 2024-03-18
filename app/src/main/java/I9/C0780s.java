package I9;

import p9.C5100b;
import wf.AbstractC6216a;

/* renamed from: I9.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780s extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8440Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5100b f8441Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ w9.j f8442h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0780s(C5100b c5100b, w9.j jVar, int i10) {
        super(0);
        this.f8440Y = i10;
        this.f8441Z = c5100b;
        this.f8442h0 = jVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f8440Y;
        w9.j jVar = this.f8442h0;
        C5100b c5100b = this.f8441Z;
        switch (i10) {
            case 0:
                Z0.i iVar = (Z0.i) c5100b.f42762b.getValue();
                if (iVar == null) {
                    return;
                }
                jVar.b(iVar.f22799a);
                return;
            case 1:
                Z0.i iVar2 = (Z0.i) c5100b.f42762b.getValue();
                if (iVar2 == null) {
                    return;
                }
                jVar.b(iVar2.f22799a);
                return;
            default:
                Z0.i iVar3 = (Z0.i) c5100b.f42762b.getValue();
                if (iVar3 == null) {
                    return;
                }
                jVar.b(iVar3.f22799a);
                return;
        }
    }
}

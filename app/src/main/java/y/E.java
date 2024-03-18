package y;

import wf.AbstractC6216a;
import z.C6721r0;
import z.C6729v0;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50090Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f50091Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C6729v0 c6729v0, int i10) {
        super(0);
        this.f50090Y = i10;
        this.f50091Z = c6729v0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10 = false;
        z10 = false;
        int i10 = this.f50090Y;
        C6729v0 c6729v0 = this.f50091Z;
        switch (i10) {
            case 0:
                Object b10 = c6729v0.b();
                V v10 = V.f50158h0;
                if (b10 == v10 && c6729v0.f51386c.getValue() == v10) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                j0.u uVar = c6729v0.f51391h;
                int size = uVar.size();
                long j6 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    j6 = Math.max(j6, ((C6721r0) uVar.get(i11)).b().f51327h);
                }
                j0.u uVar2 = c6729v0.f51392i;
                int size2 = uVar2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    j6 = Math.max(j6, ((Number) ((C6729v0) uVar2.get(i12)).f51395l.getValue()).longValue());
                }
                return Long.valueOf(j6);
        }
    }
}

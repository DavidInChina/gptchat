package zg;

import java.util.Set;
import kf.AbstractC4273I;
import wf.AbstractC6216a;

/* renamed from: zg.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6866m extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52059Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f52060Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f52061h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6866m(o oVar, p pVar, int i10) {
        super(0);
        this.f52059Y = i10;
        this.f52060Z = oVar;
        this.f52061h0 = pVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Set mo122invoke() {
        int i10 = this.f52059Y;
        p pVar = this.f52061h0;
        o oVar = this.f52060Z;
        switch (i10) {
            case 0:
                return AbstractC4273I.u2(oVar.f52065a.keySet(), pVar.o());
            default:
                return AbstractC4273I.u2(oVar.f52066b.keySet(), pVar.p());
        }
    }
}

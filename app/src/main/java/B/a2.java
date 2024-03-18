package B;

import jf.AbstractC3953c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a2 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public b2 f1262Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC3953c f1263Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6216a f1264h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f1265i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f1266j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ b2 f1267k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1268l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1267k0 = b2Var;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1266j0 = obj;
        this.f1268l0 |= Integer.MIN_VALUE;
        return this.f1267k0.a(null, null, this);
    }
}

package Za;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class v0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f23620Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0 f23621Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f23622h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(T0 t02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f23621Z = t02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f23620Y = obj;
        this.f23622h0 |= Integer.MIN_VALUE;
        return this.f23621Z.a(null, this);
    }
}

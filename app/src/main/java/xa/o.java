package xa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f49748Y;

    /* renamed from: Z  reason: collision with root package name */
    public Wg.d f49749Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f49750h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ s f49751i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f49752j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49751i0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49750h0 = obj;
        this.f49752j0 |= Integer.MIN_VALUE;
        return this.f49751i0.d(this);
    }
}

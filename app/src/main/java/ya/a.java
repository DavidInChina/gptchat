package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22142Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f22143Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22144h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r f22145i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22146j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22145i0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22144h0 = obj;
        this.f22146j0 |= Integer.MIN_VALUE;
        return this.f22145i0.a(null, this, false);
    }
}

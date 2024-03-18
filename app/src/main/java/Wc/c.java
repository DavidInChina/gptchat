package Wc;

import me.T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public T f20897Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20898Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f20899h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20900i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20899h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20898Z = obj;
        this.f20900i0 |= Integer.MIN_VALUE;
        return this.f20899h0.a(null, this);
    }
}

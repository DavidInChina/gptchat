package io.ktor.client.plugins.auth;

import he.C3418c;
import java.util.Map;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3418c f33349Y;

    /* renamed from: Z  reason: collision with root package name */
    public Yc.d f33350Z;

    /* renamed from: h0  reason: collision with root package name */
    public a f33351h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f33352i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f33353j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ g f33354k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33355l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33354k0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33353j0 = obj;
        this.f33355l0 |= Integer.MIN_VALUE;
        return g.d(this.f33354k0, null, null, null, this);
    }
}

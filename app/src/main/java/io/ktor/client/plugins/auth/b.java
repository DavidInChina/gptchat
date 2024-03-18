package io.ktor.client.plugins.auth;

import he.C3418c;
import me.U;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import te.C5760d;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f33326Y;

    /* renamed from: Z  reason: collision with root package name */
    public U f33327Z;

    /* renamed from: h0  reason: collision with root package name */
    public C3418c f33328h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5760d f33329i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f33330j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ g f33331k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33332l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33331k0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33330j0 = obj;
        this.f33332l0 |= Integer.MIN_VALUE;
        return g.b(this.f33331k0, null, null, null, null, this);
    }
}

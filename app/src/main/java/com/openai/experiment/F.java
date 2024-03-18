package com.openai.experiment;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class F extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public G f27666Y;

    /* renamed from: Z  reason: collision with root package name */
    public ExperimentKey f27667Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f27668h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ G f27669i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f27670j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f27669i0 = g10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f27668h0 = obj;
        this.f27670j0 |= Integer.MIN_VALUE;
        return G.d(this.f27669i0, null, this);
    }
}

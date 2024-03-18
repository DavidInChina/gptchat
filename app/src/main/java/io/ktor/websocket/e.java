package io.ktor.websocket;

import Pg.C1171d;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public j f33619Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1171d f33620Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33621h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ j f33622i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33623j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33622i0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33621h0 = obj;
        this.f33623j0 |= Integer.MIN_VALUE;
        return j.b(this.f33622i0, this);
    }
}

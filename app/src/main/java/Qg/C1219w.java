package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1219w extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14937Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f14938Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14939h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219w(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14938Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14937Y = obj;
        this.f14939h0 |= Integer.MIN_VALUE;
        return this.f14938Z.c(null, this);
    }
}

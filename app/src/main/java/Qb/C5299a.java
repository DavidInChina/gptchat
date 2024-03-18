package qb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import tb.g;

/* renamed from: qb.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5299a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5300b f44033Y;

    /* renamed from: Z  reason: collision with root package name */
    public g f44034Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44035h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5300b f44036i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44037j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5299a(C5300b c5300b, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44036i0 = c5300b;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44035h0 = obj;
        this.f44037j0 |= Integer.MIN_VALUE;
        return this.f44036i0.m(null, null, null, this);
    }
}

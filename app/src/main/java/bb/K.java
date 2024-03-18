package bb;

import cb.C2356Z;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class K extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public L f25727Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2356Z f25728Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f25729h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ L f25730i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f25731j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25730i0 = l10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25729h0 = obj;
        this.f25731j0 |= Integer.MIN_VALUE;
        return L.m(this.f25730i0, this);
    }
}

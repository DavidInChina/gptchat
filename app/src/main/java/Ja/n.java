package Ja;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public p f8938Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f8939Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8940h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p f8941i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8942j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8941i0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8940h0 = obj;
        this.f8942j0 |= Integer.MIN_VALUE;
        return p.b(this.f8941i0, null, this);
    }
}

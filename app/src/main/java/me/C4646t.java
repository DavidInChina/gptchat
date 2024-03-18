package me;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import ve.AbstractC6034c;

/* renamed from: me.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4646t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6034c f39254Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f39255Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f39256h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4647u f39257i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f39258j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4646t(C4647u c4647u, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39257i0 = c4647u;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39256h0 = obj;
        this.f39258j0 |= Integer.MIN_VALUE;
        return C4647u.b(this.f39257i0, null, this);
    }
}

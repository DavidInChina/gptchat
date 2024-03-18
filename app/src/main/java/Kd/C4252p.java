package kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* renamed from: kd.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4252p extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37336Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f37337Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f37338h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4252p(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37338h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37336Y = obj;
        this.f37337Z |= Integer.MIN_VALUE;
        return this.f37338h0.c(null, this);
    }
}

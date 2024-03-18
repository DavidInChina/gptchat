package Lg;

import id.AbstractC3557B;
import java.util.Iterator;
import r9.C5384a;

/* loaded from: classes2.dex */
public final class c implements Kg.k {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f11141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11142b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11143c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.n f11144d;

    public c(CharSequence charSequence, int i10, int i11, C5384a c5384a) {
        AbstractC3557B.c0("input", charSequence);
        this.f11141a = charSequence;
        this.f11142b = i10;
        this.f11143c = i11;
        this.f11144d = c5384a;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new b(this);
    }
}

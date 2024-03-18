package Cf;

import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public abstract class a implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final char f3097Y;

    /* renamed from: Z  reason: collision with root package name */
    public final char f3098Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f3099h0 = 1;

    public a(char c10, char c11) {
        this.f3097Y = c10;
        this.f3098Z = (char) r.f.J(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3097Y, this.f3098Z, this.f3099h0);
    }
}

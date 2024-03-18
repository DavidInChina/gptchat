package Hg;

import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: Hg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0731d implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC0728a f7771Y;

    public final boolean isEmpty() {
        if (this.f7771Y.r() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f7771Y.iterator();
    }
}

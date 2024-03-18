package c0;

import d0.C2564b;
import java.util.Collection;
import xf.AbstractC6438a;

/* renamed from: c0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC2274d extends AbstractC2272b, Collection, AbstractC6438a {
    AbstractC2274d P(C2564b c2564b);

    AbstractC2274d Z(int i10);

    @Override // java.util.List
    AbstractC2274d add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    AbstractC2274d add(Object obj);

    @Override // java.util.List, java.util.Collection
    AbstractC2274d addAll(Collection collection);

    d0.f builder();

    @Override // java.util.List
    AbstractC2274d set(int i10, Object obj);
}

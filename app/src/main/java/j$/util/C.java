package j$.util;

import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C extends c0 {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SortedSet f35203f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f35203f = sortedSet;
    }

    @Override // j$.util.c0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f35203f.comparator();
    }
}

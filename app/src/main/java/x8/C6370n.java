package x8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: x8.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6370n extends C6365i implements SortedSet {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49583i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6370n(AbstractC6359c abstractC6359c, SortedMap sortedMap) {
        super(abstractC6359c, sortedMap);
        this.f49583i0 = abstractC6359c;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.f49568Z;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C6370n(this.f49583i0, f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C6370n(this.f49583i0, f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C6370n(this.f49583i0, f().tailMap(obj));
    }
}

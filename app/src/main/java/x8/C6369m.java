package x8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: x8.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6369m extends C6363g implements SortedMap {

    /* renamed from: j0  reason: collision with root package name */
    public SortedSet f49577j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49578k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6369m(AbstractC6359c abstractC6359c, SortedMap sortedMap) {
        super(abstractC6359c, sortedMap);
        this.f49578k0 = abstractC6359c;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return g().comparator();
    }

    public SortedSet d() {
        return new C6370n(this.f49578k0, g());
    }

    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f49577j0;
        if (sortedSet == null) {
            SortedSet d10 = d();
            this.f49577j0 = d10;
            return d10;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.f49560h0;
    }

    public SortedMap headMap(Object obj) {
        return new C6369m(this.f49578k0, g().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return g().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C6369m(this.f49578k0, g().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C6369m(this.f49578k0, g().tailMap(obj));
    }
}

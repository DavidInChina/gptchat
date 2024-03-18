package ti;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class r implements zi.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f46317a;

    /* renamed from: b  reason: collision with root package name */
    public int f46318b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f46319c = new LinkedList();

    public r(char c10) {
        this.f46317a = c10;
    }

    @Override // zi.a
    public final char a() {
        return this.f46317a;
    }

    @Override // zi.a
    public final int b() {
        return this.f46318b;
    }

    @Override // zi.a
    public final int c(d dVar, d dVar2) {
        zi.a aVar;
        int size = dVar.f46246a.size();
        LinkedList linkedList = this.f46319c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (zi.a) it.next();
                if (aVar.b() <= size) {
                    break;
                }
            } else {
                aVar = (zi.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.c(dVar, dVar2);
    }

    @Override // zi.a
    public final char d() {
        return this.f46317a;
    }

    public final void e(zi.a aVar) {
        int b10 = aVar.b();
        LinkedList linkedList = this.f46319c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zi.a aVar2 = (zi.a) listIterator.next();
            int b11 = aVar2.b();
            if (b10 > b11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (b10 == b11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f46317a + "' and minimum length " + b10 + "; conflicting processors: " + aVar2 + ", " + aVar);
            }
        }
        linkedList.add(aVar);
        this.f46318b = b10;
    }
}

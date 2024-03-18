package sh;

import Qh.AbstractC1239q;
import Qh.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import yh.Y0;

/* renamed from: sh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5629a extends AbstractC1239q {

    /* renamed from: Z  reason: collision with root package name */
    public final List f45598Z;

    public C5629a(List list) {
        super(0);
        this.f45598Z = list;
    }

    public final C5629a I(Y0 y02) {
        List<AbstractC5630b> list = this.f45598Z;
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC5630b abstractC5630b : list) {
            arrayList.add(abstractC5630b.a(y02));
        }
        return new C5629a(arrayList);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (AbstractC5630b) this.f45598Z.get(i10);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45598Z.size();
    }

    @Override // Qh.AbstractC1239q
    public final r y(List list) {
        return new C5629a(list);
    }

    public C5629a(AbstractC5630b... abstractC5630bArr) {
        this(Arrays.asList(abstractC5630bArr));
    }
}

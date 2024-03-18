package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441c0 extends AbstractC2483y implements RandomAccess, AbstractC2443d0 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f26912Z;

    static {
        new C2441c0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441c0(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f26912Z = arrayList;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final List E() {
        return Collections.unmodifiableList(this.f26912Z);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final Object O(int i10) {
        return this.f26912Z.get(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final void R(E e10) {
        f();
        this.f26912Z.add(e10);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        f();
        this.f26912Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        f();
        if (collection instanceof AbstractC2443d0) {
            collection = ((AbstractC2443d0) collection).E();
        }
        boolean addAll = this.f26912Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f26912Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final AbstractC2443d0 q() {
        if (this.f26991Y) {
            return new E0(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        f();
        Object remove = this.f26912Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof E) {
            E e10 = (E) remove;
            Charset charset = Y.f26890a;
            if (e10.I() == 0) {
                return "";
            }
            F f6 = (F) e10;
            return new String(f6.f26842h0, 0, f6.I(), charset);
        }
        return new String((byte[]) remove, Y.f26890a);
    }

    /* renamed from: s */
    public final String get(int i10) {
        String str;
        List list = this.f26912Z;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            Charset charset = Y.f26890a;
            if (e10.I() == 0) {
                str = "";
            } else {
                F f6 = (F) e10;
                str = new String(f6.f26842h0, 0, f6.I(), charset);
            }
            F f10 = (F) e10;
            int I10 = f10.I();
            L0.f26862a.getClass();
            if (G.a(f10.f26842h0, 0, I10)) {
                list.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, Y.f26890a);
        G g10 = L0.f26862a;
        int length = bArr.length;
        L0.f26862a.getClass();
        if (G.a(bArr, 0, length)) {
            list.set(i10, str2);
        }
        return str2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        Object obj2 = this.f26912Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof E) {
            E e10 = (E) obj2;
            Charset charset = Y.f26890a;
            if (e10.I() == 0) {
                return "";
            }
            F f6 = (F) e10;
            return new String(f6.f26842h0, 0, f6.I(), charset);
        }
        return new String((byte[]) obj2, Y.f26890a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26912Z.size();
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final X u(int i10) {
        List list = this.f26912Z;
        if (i10 >= list.size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(list);
            return new C2441c0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C2441c0(ArrayList arrayList) {
        super(true);
        this.f26912Z = arrayList;
    }

    public C2441c0() {
        super(false);
        this.f26912Z = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f26912Z.size(), collection);
    }
}

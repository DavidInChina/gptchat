package dh;

import bh.C2222l;
import bh.C2224n;
import eh.AbstractC2904d;
import eh.AbstractC2920t;
import eh.AbstractC2923w;
import eh.C2921u;
import fh.AbstractC3096w;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wf.AbstractC6216a;

/* renamed from: dh.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2700f0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28447Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f28448Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f28449h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2700f0(Object obj, int i10, Object obj2) {
        super(0);
        this.f28447Y = i10;
        this.f28448Z = obj;
        this.f28449h0 = obj2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        String str;
        String[] names;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f28447Y;
        Object obj = this.f28449h0;
        Object obj2 = this.f28448Z;
        switch (i10) {
            case 0:
                return Ad.l.O((String) obj2, C2224n.f26018d, new SerialDescriptor[0], new Xf.f(23, (C2676B) obj));
            case 1:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                AbstractC2904d abstractC2904d = (AbstractC2904d) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z10 = abstractC2904d.f29416a.f29454n && AbstractC3557B.K(serialDescriptor.e(), C2222l.f26014a);
                AbstractC2923w g10 = AbstractC3096w.g(serialDescriptor, abstractC2904d);
                int f6 = serialDescriptor.f();
                for (int i11 = 0; i11 < f6; i11++) {
                    List h10 = serialDescriptor.h(i11);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h10) {
                        if (obj3 instanceof AbstractC2920t) {
                            arrayList.add(obj3);
                        }
                    }
                    AbstractC2920t abstractC2920t = (AbstractC2920t) kf.t.D2(arrayList);
                    if (abstractC2920t != null && (names = abstractC2920t.names()) != null) {
                        for (String str2 : names) {
                            if (z10) {
                                str2 = str2.toLowerCase(Locale.ROOT);
                                AbstractC3557B.b0("toLowerCase(...)", str2);
                            }
                            AbstractC3096w.a(linkedHashMap, serialDescriptor, str2, i11);
                        }
                    }
                    if (z10) {
                        str = serialDescriptor.g(i11).toLowerCase(Locale.ROOT);
                        AbstractC3557B.b0("toLowerCase(...)", str);
                    } else {
                        str = g10 != null ? ((C2921u) g10).a(serialDescriptor.g(i11), serialDescriptor) : null;
                    }
                    if (str != null) {
                        AbstractC3096w.a(linkedHashMap, serialDescriptor, str, i11);
                    }
                }
                return linkedHashMap.isEmpty() ? kf.w.f37484Y : linkedHashMap;
            case 2:
                SerialDescriptor serialDescriptor2 = (SerialDescriptor) obj2;
                int f10 = serialDescriptor2.f();
                String[] strArr = new String[f10];
                for (int i12 = 0; i12 < f10; i12++) {
                    strArr[i12] = ((C2921u) ((AbstractC2923w) obj)).a(serialDescriptor2.g(i12), serialDescriptor2);
                }
                return strArr;
            case 3:
                mo122invoke();
                return yVar;
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f28447Y;
        Object obj = this.f28448Z;
        switch (i10) {
            case 3:
                ((hh.t) ((Xf.f) obj).f21985Z).c(new Xf.f(28, this));
                return;
            default:
                Jb.c cVar = new Jb.c(22, this);
                ((hh.t) ((Jb.c) obj).f8970Z).getClass();
                hh.t.b(cVar);
                return;
        }
    }
}

package yg;

import Ag.u;
import Jf.q;
import Mf.B;
import Mf.H;
import Mf.K;
import U3.i;
import hg.C3422a;
import id.AbstractC3557B;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kg.C4291c;
import kotlin.jvm.internal.j;
import tg.C5768a;
import xg.C6449d;
import xg.m;
import xg.p;
import yf.AbstractC6583a;

/* renamed from: yg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6586c implements Jf.c {

    /* renamed from: b  reason: collision with root package name */
    public final C6588e f50910b = new Object();

    /* JADX WARN: Type inference failed for: r3v0, types: [yg.b, kotlin.jvm.internal.j] */
    public H a(u uVar, B b10, Iterable iterable, Of.e eVar, Of.b bVar, boolean z10) {
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("builtInsModule", b10);
        AbstractC3557B.c0("classDescriptorFactories", iterable);
        AbstractC3557B.c0("platformDependentDeclarationFilter", eVar);
        AbstractC3557B.c0("additionalClassPartsProvider", bVar);
        Set set = q.f9209p;
        ?? jVar = new j(1, this.f50910b);
        AbstractC3557B.c0("packageFqNames", set);
        Set<C4291c> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(set2, 10));
        for (C4291c c4291c : set2) {
            C6584a.f50909q.getClass();
            String a5 = C6584a.a(c4291c);
            InputStream inputStream = (InputStream) jVar.invoke(a5);
            if (inputStream != null) {
                arrayList.add(C3422a.h(c4291c, uVar, b10, inputStream));
            } else {
                throw new IllegalStateException(R.a.r("Resource not found in classpath: ", a5));
            }
        }
        K k10 = new K(arrayList);
        i iVar = new i(uVar, b10);
        p pVar = new p(k10);
        C6584a c6584a = C6584a.f50909q;
        m mVar = new m(uVar, b10, pVar, new C6449d(b10, iVar, c6584a), k10, iterable, iVar, bVar, eVar, c6584a.f48501a, null, new C5768a(uVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6587d) it.next()).x0(mVar);
        }
        return k10;
    }
}

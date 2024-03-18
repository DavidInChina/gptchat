package Hg;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import kg.C4294f;

/* renamed from: Hg.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0738k {

    /* renamed from: a  reason: collision with root package name */
    public final C4294f f7778a;

    /* renamed from: b  reason: collision with root package name */
    public final Lg.i f7779b;

    /* renamed from: c  reason: collision with root package name */
    public final Collection f7780c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.k f7781d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0732e[] f7782e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0738k(Collection collection, AbstractC0732e[] abstractC0732eArr, wf.k kVar) {
        this(null, null, collection, kVar, (AbstractC0732e[]) Arrays.copyOf(abstractC0732eArr, abstractC0732eArr.length));
        AbstractC3557B.c0("nameList", collection);
        AbstractC3557B.c0("additionalChecks", kVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0738k(C4294f c4294f, AbstractC0732e[] abstractC0732eArr, wf.k kVar) {
        this(c4294f, null, null, kVar, (AbstractC0732e[]) Arrays.copyOf(abstractC0732eArr, abstractC0732eArr.length));
        AbstractC3557B.c0("name", c4294f);
        AbstractC3557B.c0("additionalChecks", kVar);
    }

    public C0738k(C4294f c4294f, Lg.i iVar, Collection collection, wf.k kVar, AbstractC0732e... abstractC0732eArr) {
        this.f7778a = c4294f;
        this.f7779b = iVar;
        this.f7780c = collection;
        this.f7781d = kVar;
        this.f7782e = abstractC0732eArr;
    }

    public /* synthetic */ C0738k(C4294f c4294f, AbstractC0732e[] abstractC0732eArr) {
        this(c4294f, abstractC0732eArr, C0735h.f7775Y);
    }

    public /* synthetic */ C0738k(Collection collection, AbstractC0732e[] abstractC0732eArr) {
        this(collection, abstractC0732eArr, C0737j.f7777Y);
    }
}

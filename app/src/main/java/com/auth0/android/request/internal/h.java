package com.auth0.android.request.internal;

import I8.E;
import I8.F;
import L8.w;
import L8.x;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x8.W;

/* loaded from: classes2.dex */
public final class h extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26732a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f26733b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f26734c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(L8.e eVar, int i10, int i11, int i12) {
        this(eVar, i10, i11);
        this.f26732a = 2;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Field[] declaredFields;
        Date c10;
        Class cls;
        Collection collection = null;
        switch (this.f26732a) {
            case 0:
                Object b10 = ((E) this.f26733b).b(bVar);
                for (Field field : b10.getClass().getDeclaredFields()) {
                    if (field.getAnnotation(g.class) != null) {
                        try {
                            field.setAccessible(true);
                            if (field.get(b10) == null) {
                                throw new RuntimeException("Missing required attribute " + field.getName());
                            }
                        } catch (IllegalAccessException unused) {
                            throw new RuntimeException(R.a.r("Missing required attribute ", field.getName()));
                        }
                    }
                }
                return b10;
            case 1:
                if (bVar.R0() == 9) {
                    bVar.A0();
                } else {
                    collection = (Collection) ((K8.n) this.f26734c).i();
                    bVar.a();
                    while (bVar.P()) {
                        collection.add(((E) this.f26733b).b(bVar));
                    }
                    bVar.k();
                }
                return collection;
            case 2:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H02 = bVar.H0();
                synchronized (((List) this.f26734c)) {
                    try {
                        Iterator it = ((List) this.f26734c).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    c10 = ((DateFormat) it.next()).parse(H02);
                                } catch (ParseException unused2) {
                                }
                            } else {
                                try {
                                    c10 = M8.a.c(H02, new ParsePosition(0));
                                } catch (ParseException e10) {
                                    StringBuilder s10 = android.gov.nist.core.a.s("Failed parsing '", H02, "' as Date; at path ");
                                    s10.append(bVar.O());
                                    throw new RuntimeException(s10.toString(), e10);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return ((L8.e) this.f26733b).a(c10);
            default:
                Object b11 = ((x) this.f26734c).f10855h0.b(bVar);
                if (b11 != null) {
                    if (!((Class) this.f26733b).isInstance(b11)) {
                        throw new RuntimeException("Expected a " + cls.getName() + " but was " + b11.getClass().getName() + "; at path " + bVar.O());
                    }
                }
                return b11;
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String format;
        switch (this.f26732a) {
            case 0:
                ((E) this.f26733b).c(cVar, obj);
                return;
            case 1:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.F();
                    return;
                }
                cVar.h();
                for (Object obj2 : collection) {
                    ((E) this.f26733b).c(cVar, obj2);
                }
                cVar.k();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    cVar.F();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((List) this.f26734c).get(0);
                synchronized (((List) this.f26734c)) {
                    format = dateFormat.format(date);
                }
                cVar.f0(format);
                return;
            default:
                ((x) this.f26734c).f10855h0.c(cVar, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f26732a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((List) this.f26734c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(L8.e eVar, String str, int i10) {
        this(eVar, str);
        this.f26732a = 2;
    }

    public h(I8.n nVar, Type type, E e10, K8.n nVar2) {
        this.f26732a = 1;
        this.f26733b = new w(nVar, e10, type);
        this.f26734c = nVar2;
    }

    public h(F f6, Object obj, int i10) {
        this.f26732a = i10;
        this.f26734c = f6;
        this.f26733b = obj;
    }

    public h(L8.e eVar, int i10, int i11) {
        this.f26732a = 2;
        ArrayList arrayList = new ArrayList();
        this.f26734c = arrayList;
        Objects.requireNonNull(eVar);
        this.f26733b = eVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (K8.g.f9550a >= 9) {
            arrayList.add(W.K(i10, i11));
        }
    }

    public h(L8.e eVar, String str) {
        this.f26732a = 2;
        ArrayList arrayList = new ArrayList();
        this.f26734c = arrayList;
        Objects.requireNonNull(eVar);
        this.f26733b = eVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }
}

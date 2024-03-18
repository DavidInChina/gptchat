package com.revenuecat.purchases.utils;

import Lg.j;
import Lg.m;
import eh.AbstractC2911k;
import fh.C3071N;
import fh.C3091r;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lkotlinx/serialization/json/b;", "", "", "", "asMap", "(Lkotlinx/serialization/json/b;)Ljava/util/Map;", "getExtractedContent", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "extractedContent", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(b bVar) {
        AbstractC3557B.c0("<this>", bVar);
        if (bVar instanceof c) {
            Set<Map.Entry> entrySet = AbstractC2911k.g(bVar).f37662Y.entrySet();
            int n02 = P4.a.n0(AbstractC6583a.H1(entrySet, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), getExtractedContent((b) entry.getValue()));
            }
            return linkedHashMap;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object getExtractedContent(b bVar) {
        kotlinx.serialization.json.a aVar;
        Long l10;
        String e10;
        Float f6 = null;
        if (bVar instanceof d) {
            d h10 = AbstractC2911k.h(bVar);
            if (h10.s()) {
                e10 = h10.r();
            } else {
                Object d10 = AbstractC2911k.d(h10);
                if (d10 == null) {
                    try {
                        l10 = Long.valueOf(new C3071N(h10.r()).i());
                    } catch (C3091r unused) {
                        l10 = null;
                    }
                    if (l10 != null) {
                        long longValue = l10.longValue();
                        if (-2147483648L <= longValue && longValue <= 2147483647L) {
                            d10 = Integer.valueOf((int) longValue);
                            if (d10 == null) {
                                try {
                                    d10 = Long.valueOf(new C3071N(h10.r()).i());
                                } catch (C3091r unused2) {
                                    d10 = null;
                                }
                                if (d10 == null) {
                                    String r10 = h10.r();
                                    AbstractC3557B.c0("<this>", r10);
                                    try {
                                        if (j.f11154a.b(r10)) {
                                            f6 = Float.valueOf(Float.parseFloat(r10));
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    if (f6 == null) {
                                        d10 = m.V1(h10.r());
                                        if (d10 == null) {
                                            e10 = AbstractC2911k.e(h10);
                                        }
                                    } else {
                                        return f6;
                                    }
                                }
                            }
                        }
                    }
                    d10 = null;
                    if (d10 == null) {
                    }
                }
                return d10;
            }
            return e10;
        } else if (bVar instanceof kotlinx.serialization.json.a) {
            InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
            AbstractC3557B.c0("<this>", bVar);
            if (bVar instanceof kotlinx.serialization.json.a) {
                aVar = (kotlinx.serialization.json.a) bVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(aVar, 10));
                for (b bVar2 : aVar.f37661Y) {
                    arrayList.add(getExtractedContent(bVar2));
                }
                return arrayList;
            }
            AbstractC2911k.c("JsonArray", bVar);
            throw null;
        } else if (!(bVar instanceof c)) {
            return null;
        } else {
            Set<Map.Entry> entrySet = AbstractC2911k.g(bVar).f37662Y.entrySet();
            int n02 = P4.a.n0(AbstractC6583a.H1(entrySet, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), getExtractedContent((b) entry.getValue()));
            }
            return linkedHashMap;
        }
    }
}

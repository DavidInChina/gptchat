package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import jf.C3959i;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import l8.AbstractC4344b;
import r9.y;
import xf.AbstractC6438a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0096\u0001J\u0013\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0018\u0010!\u001a\u0004\u0018\u00010\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0096\u0003J\b\u0010$\u001a\u00020\u000fH\u0016J\u0011\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0001J\t\u0010&\u001a\u00020\u0017H\u0096\u0001J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0003J\u0011\u0010)\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0096\u0001J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+2\u0006\u0010#\u001a\u00020\u000fH\u0096\u0001J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH\u0096\u0001J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00100\u001a\u000201R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions;", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptions", "(Ljava/util/List;)V", "basePlan", "getBasePlan", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOffer", "getDefaultOffer", "freeTrial", "getFreeTrial", "introOffer", "getIntroOffer", "size", "", "getSize", "()I", "billingPeriodToDays", "period", "Lcom/revenuecat/purchases/models/Period;", "billingPeriodToDays$purchases_customEntitlementComputationRelease", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "findLongestFreeTrial", "offers", "findLowestNonFreeOffer", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "withTag", ParameterNames.TAG, "", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class SubscriptionOptions implements List<SubscriptionOption>, AbstractC6438a, j$.util.List {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String RC_IGNORE_OFFER_TAG = "rc-ignore-offer";
    private final List<SubscriptionOption> subscriptionOptions;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions$Companion;", "", "()V", "RC_IGNORE_OFFER_TAG", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionOptions(List<? extends SubscriptionOption> list) {
        AbstractC3557B.c0("subscriptionOptions", list);
        this.subscriptionOptions = list;
    }

    private final SubscriptionOption findLongestFreeTrial(List<? extends SubscriptionOption> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            C3959i c3959i = null;
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase freePhase = subscriptionOption.getFreePhase();
            if (freePhase != null) {
                c3959i = new C3959i(subscriptionOption, Integer.valueOf(billingPeriodToDays$purchases_customEntitlementComputationRelease(freePhase.getBillingPeriod())));
            }
            if (c3959i != null) {
                arrayList.add(c3959i);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((C3959i) obj).f36156Z).intValue();
                do {
                    Object next = it2.next();
                    int intValue2 = ((Number) ((C3959i) next).f36156Z).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        }
        C3959i c3959i2 = (C3959i) obj;
        if (c3959i2 == null) {
            return null;
        }
        return (SubscriptionOption) c3959i2.f36155Y;
    }

    private final SubscriptionOption findLowestNonFreeOffer(List<? extends SubscriptionOption> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            C3959i c3959i = null;
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase introPhase = subscriptionOption.getIntroPhase();
            if (introPhase != null) {
                c3959i = new C3959i(subscriptionOption, Long.valueOf(introPhase.getPrice().getAmountMicros()));
            }
            if (c3959i != null) {
                arrayList.add(c3959i);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                long longValue = ((Number) ((C3959i) obj).f36156Z).longValue();
                do {
                    Object next = it2.next();
                    long longValue2 = ((Number) ((C3959i) next).f36156Z).longValue();
                    if (longValue > longValue2) {
                        obj = next;
                        longValue = longValue2;
                    }
                } while (it2.hasNext());
            }
        }
        C3959i c3959i2 = (C3959i) obj;
        if (c3959i2 == null) {
            return null;
        }
        return (SubscriptionOption) c3959i2.f36155Y;
    }

    /* renamed from: add  reason: avoid collision after fix types in other method */
    public void add2(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int billingPeriodToDays$purchases_customEntitlementComputationRelease(Period period) {
        Map map;
        int i10;
        AbstractC3557B.c0("period", period);
        map = SubscriptionOptionsKt.DAYS_IN_UNIT;
        Integer num = (Integer) map.get(period.getUnit());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        return period.getValue() * i10;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SubscriptionOption subscriptionOption) {
        AbstractC3557B.c0("element", subscriptionOption);
        return this.subscriptionOptions.contains(subscriptionOption);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        AbstractC3557B.c0("elements", collection);
        return this.subscriptionOptions.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        SubscriptionOptions subscriptionOptions = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(SubscriptionOptions.class, cls)) {
            return false;
        }
        if (obj instanceof SubscriptionOptions) {
            subscriptionOptions = (SubscriptionOptions) obj;
        }
        if (subscriptionOptions != null && AbstractC3557B.K(AbstractC4344b.F0(this.subscriptionOptions), AbstractC4344b.F0(((SubscriptionOptions) obj).subscriptionOptions))) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public SubscriptionOption get(int i10) {
        return this.subscriptionOptions.get(i10);
    }

    public final SubscriptionOption getBasePlan() {
        SubscriptionOption subscriptionOption;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (it.hasNext()) {
                subscriptionOption = it.next();
                if (subscriptionOption.isBasePlan()) {
                    break;
                }
            } else {
                subscriptionOption = null;
                break;
            }
        }
        return subscriptionOption;
    }

    public final SubscriptionOption getDefaultOffer() {
        SubscriptionOption subscriptionOption;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (it.hasNext()) {
                subscriptionOption = it.next();
                if (subscriptionOption.isBasePlan()) {
                    break;
                }
            } else {
                subscriptionOption = null;
                break;
            }
        }
        SubscriptionOption subscriptionOption2 = subscriptionOption;
        if (subscriptionOption2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SubscriptionOption subscriptionOption3 : this) {
            if (!subscriptionOption3.isBasePlan()) {
                arrayList.add(subscriptionOption3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((SubscriptionOption) obj).getTags().contains(RC_IGNORE_OFFER_TAG)) {
                arrayList2.add(obj);
            }
        }
        SubscriptionOption findLongestFreeTrial = findLongestFreeTrial(arrayList2);
        if (findLongestFreeTrial != null || (findLongestFreeTrial = findLowestNonFreeOffer(arrayList2)) != null) {
            return findLongestFreeTrial;
        }
        return subscriptionOption2;
    }

    public final SubscriptionOption getFreeTrial() {
        SubscriptionOption subscriptionOption;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (it.hasNext()) {
                subscriptionOption = it.next();
                if (subscriptionOption.getFreePhase() != null) {
                    break;
                }
            } else {
                subscriptionOption = null;
                break;
            }
        }
        return subscriptionOption;
    }

    public final SubscriptionOption getIntroOffer() {
        SubscriptionOption subscriptionOption;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (it.hasNext()) {
                subscriptionOption = it.next();
                if (subscriptionOption.getIntroPhase() != null) {
                    break;
                }
            } else {
                subscriptionOption = null;
                break;
            }
        }
        return subscriptionOption;
    }

    public int getSize() {
        return this.subscriptionOptions.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return AbstractC4344b.F0(this.subscriptionOptions).hashCode();
    }

    public int indexOf(SubscriptionOption subscriptionOption) {
        AbstractC3557B.c0("element", subscriptionOption);
        return this.subscriptionOptions.indexOf(subscriptionOption);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.subscriptionOptions.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<SubscriptionOption> iterator() {
        return this.subscriptionOptions.iterator();
    }

    public int lastIndexOf(SubscriptionOption subscriptionOption) {
        AbstractC3557B.c0("element", subscriptionOption);
        return this.subscriptionOptions.lastIndexOf(subscriptionOption);
    }

    @Override // java.util.List
    public ListIterator<SubscriptionOption> listIterator() {
        return this.subscriptionOptions.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public SubscriptionOption remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<SubscriptionOption> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public SubscriptionOption set2(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super SubscriptionOption> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<SubscriptionOption> subList(int i10, int i11) {
        return this.subscriptionOptions.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return m.J(this);
    }

    public final List<SubscriptionOption> withTag(String str) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        ArrayList arrayList = new ArrayList();
        for (SubscriptionOption subscriptionOption : this) {
            if (subscriptionOption.getTags().contains(str)) {
                arrayList.add(subscriptionOption);
            }
        }
        return arrayList;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return false;
        }
        return contains((SubscriptionOption) obj);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return -1;
        }
        return indexOf((SubscriptionOption) obj);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return -1;
        }
        return lastIndexOf((SubscriptionOption) obj);
    }

    @Override // java.util.List
    public ListIterator<SubscriptionOption> listIterator(int i10) {
        return this.subscriptionOptions.listIterator(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ SubscriptionOption set(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public boolean add(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        AbstractC3557B.c0("array", tArr);
        return (T[]) m.K(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

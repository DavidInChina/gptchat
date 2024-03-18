package android.gov.nist.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class MultiValueMapImpl<V> implements MultiValueMap<String, V>, Cloneable {
    private static final long serialVersionUID = 4275505380960964605L;
    private HashMap<String, ArrayList<V>> map = null;

    @Override // java.util.Map
    public void clear() {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap != null) {
            for (Map.Entry<String, ArrayList<V>> entry : hashMap.entrySet()) {
                entry.getValue().clear();
            }
            this.map.clear();
        }
    }

    public Object clone() {
        MultiValueMapImpl multiValueMapImpl = new MultiValueMapImpl();
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap != null) {
            multiValueMapImpl.map = (HashMap) hashMap.clone();
        }
        return multiValueMapImpl;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<String, ArrayList<V>>> set;
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap != null) {
            set = hashMap.entrySet();
        } else {
            set = null;
        }
        if (set == null) {
            return false;
        }
        for (Map.Entry<String, ArrayList<V>> entry : set) {
            if (entry.getValue().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set entrySet() {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return new HashSet();
        }
        return hashMap.entrySet();
    }

    public HashMap<String, ArrayList<V>> getMap() {
        if (this.map == null) {
            this.map = new HashMap<>(0);
        }
        return this.map;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return true;
        }
        return hashMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return new HashSet();
        }
        return hashMap.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((String) obj, (List) ((List) obj2));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends List<V>> map) {
        for (String str : map.keySet()) {
            ArrayList<V> arrayList = new ArrayList<>();
            arrayList.addAll(map.get(str));
            getMap().put(str, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.core.MultiValueMap
    public /* bridge */ /* synthetic */ Object removeKV(String str, Object obj) {
        return removeKV2(str, (String) obj);
    }

    @Override // java.util.Map
    public int size() {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    @Override // java.util.Map
    public Collection values() {
        if (this.map == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.map.size());
        for (Map.Entry<String, ArrayList<V>> entry : this.map.entrySet()) {
            for (Object obj : entry.getValue().toArray()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.util.Map
    public List<V> get(Object obj) {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(obj);
    }

    public List<V> put(String str, V v10) {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        ArrayList<V> arrayList = hashMap != null ? hashMap.get(str) : null;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            getMap().put(str, arrayList);
        }
        arrayList.add(v10);
        return arrayList;
    }

    @Override // java.util.Map
    public List<V> remove(Object obj) {
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null) {
            return null;
        }
        return hashMap.remove(obj);
    }

    /* renamed from: removeKV  reason: avoid collision after fix types in other method */
    public Object removeKV2(String str, V v10) {
        ArrayList<V> arrayList;
        HashMap<String, ArrayList<V>> hashMap = this.map;
        if (hashMap == null || (arrayList = hashMap.get(str)) == null) {
            return null;
        }
        return Boolean.valueOf(arrayList.remove(v10));
    }

    public List<V> put(String str, List<V> list) {
        return getMap().put(str, (ArrayList) list);
    }
}

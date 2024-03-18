package I8;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: Y  reason: collision with root package name */
    public final Serializable f8134Y;

    public w(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f8134Y = bool;
    }

    public static boolean U(w wVar) {
        Serializable serializable = wVar.f8134Y;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // I8.r
    public final long I() {
        if (this.f8134Y instanceof Number) {
            return M().longValue();
        }
        return Long.parseLong(T());
    }

    @Override // I8.r
    public final Number M() {
        Serializable serializable = this.f8134Y;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new K8.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // I8.r
    public final String T() {
        Serializable serializable = this.f8134Y;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return M().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        Serializable serializable = this.f8134Y;
        Serializable serializable2 = wVar.f8134Y;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (U(this) && U(wVar)) {
            if (M().longValue() == wVar.M().longValue()) {
                return true;
            }
            return false;
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = M().doubleValue();
            double doubleValue2 = wVar.M().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        } else {
            return serializable.equals(serializable2);
        }
    }

    @Override // I8.r
    public final boolean f() {
        Serializable serializable = this.f8134Y;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(T());
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f8134Y;
        if (serializable == null) {
            return 31;
        }
        if (U(this)) {
            doubleToLongBits = M().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(M().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // I8.r
    public final int r() {
        if (this.f8134Y instanceof Number) {
            return M().intValue();
        }
        return Integer.parseInt(T());
    }

    public w(Number number) {
        Objects.requireNonNull(number);
        this.f8134Y = number;
    }

    public w(String str) {
        Objects.requireNonNull(str);
        this.f8134Y = str;
    }
}

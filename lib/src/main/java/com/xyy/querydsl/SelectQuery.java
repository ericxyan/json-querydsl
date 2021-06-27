package com.xyy.querydsl;

import com.xyy.querydsl.clause.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectQuery implements Query {
    private boolean distinct;
    private List<SelectItem> select;
    private List<FromClause> from;
    private List<WhereClause> where;
    private List<GroupByClause> groupBy;
    private List<HavingClause> having;
    private List<OrderByClause> orderBy;

}

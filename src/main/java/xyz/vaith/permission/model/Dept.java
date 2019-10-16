package xyz.vaith.permission.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Dept implements Serializable {

    private static final long serialVersionUID = 1571190933661L;


    /**
    * 主键
    * 部门id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 部门名称
    * isNullAble:0
    */
    private String name;

    /**
    * 上级部门id
    * isNullAble:0,defaultVal:0
    */
    private Integer parentId;

    /**
    * 部门层级
    * isNullAble:0,defaultVal:
    */
    private String level;

    /**
    * 部门在当前层级下的顺序, 由小到大
    * isNullAble:0,defaultVal:0
    */
    private Integer seq;

    /**
    * 备注
    * isNullAble:1,defaultVal:
    */
    private String remark;

    /**
    * 操作作者
    * isNullAble:0,defaultVal:
    */
    private String operator;

    /**
    * 最后一次操作者的ip
    * isNullAble:0,defaultVal:
    */
    private String operateIp;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 修改时间
    * isNullAble:0
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setParentId(Integer parentId){this.parentId = parentId;}

    public Integer getParentId(){return this.parentId;}

    public void setLevel(String level){this.level = level;}

    public String getLevel(){return this.level;}

    public void setSeq(Integer seq){this.seq = seq;}

    public Integer getSeq(){return this.seq;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setOperator(String operator){this.operator = operator;}

    public String getOperator(){return this.operator;}

    public void setOperateIp(String operateIp){this.operateIp = operateIp;}

    public String getOperateIp(){return this.operateIp;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "parentId='" + parentId + '\'' +
                "level='" + level + '\'' +
                "seq='" + seq + '\'' +
                "remark='" + remark + '\'' +
                "operator='" + operator + '\'' +
                "operateIp='" + operateIp + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Dept set;

        private ConditionBuilder where;

        public UpdateBuilder set(Dept set){
            this.set = set;
            return this;
        }

        public Dept getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Dept{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> levelList;

        public List<String> getLevelList(){return this.levelList;}


        private List<String> fuzzyLevel;

        public List<String> getFuzzyLevel(){return this.fuzzyLevel;}

        private List<String> rightFuzzyLevel;

        public List<String> getRightFuzzyLevel(){return this.rightFuzzyLevel;}
        private List<Integer> seqList;

        public List<Integer> getSeqList(){return this.seqList;}

        private Integer seqSt;

        private Integer seqEd;

        public Integer getSeqSt(){return this.seqSt;}

        public Integer getSeqEd(){return this.seqEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> operatorList;

        public List<String> getOperatorList(){return this.operatorList;}


        private List<String> fuzzyOperator;

        public List<String> getFuzzyOperator(){return this.fuzzyOperator;}

        private List<String> rightFuzzyOperator;

        public List<String> getRightFuzzyOperator(){return this.rightFuzzyOperator;}
        private List<String> operateIpList;

        public List<String> getOperateIpList(){return this.operateIpList;}


        private List<String> fuzzyOperateIp;

        public List<String> getFuzzyOperateIp(){return this.fuzzyOperateIp;}

        private List<String> rightFuzzyOperateIp;

        public List<String> getRightFuzzyOperateIp(){return this.rightFuzzyOperateIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public QueryBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public QueryBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public QueryBuilder parentId(Integer parentId){
            setParentId(parentId);
            return this;
        }

        public QueryBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public QueryBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","parentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","parentId");
            return this;
        }

        public QueryBuilder fuzzyLevel (List<String> fuzzyLevel){
            this.fuzzyLevel = fuzzyLevel;
            return this;
        }

        public QueryBuilder fuzzyLevel (String ... fuzzyLevel){
            this.fuzzyLevel = solveNullList(fuzzyLevel);
            return this;
        }

        public QueryBuilder rightFuzzyLevel (List<String> rightFuzzyLevel){
            this.rightFuzzyLevel = rightFuzzyLevel;
            return this;
        }

        public QueryBuilder rightFuzzyLevel (String ... rightFuzzyLevel){
            this.rightFuzzyLevel = solveNullList(rightFuzzyLevel);
            return this;
        }

        public QueryBuilder level(String level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(String ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public QueryBuilder levelList(List<String> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
            return this;
        }

        public QueryBuilder seqBetWeen(Integer seqSt,Integer seqEd){
            this.seqSt = seqSt;
            this.seqEd = seqEd;
            return this;
        }

        public QueryBuilder seqGreaterEqThan(Integer seqSt){
            this.seqSt = seqSt;
            return this;
        }
        public QueryBuilder seqLessEqThan(Integer seqEd){
            this.seqEd = seqEd;
            return this;
        }


        public QueryBuilder seq(Integer seq){
            setSeq(seq);
            return this;
        }

        public QueryBuilder seqList(Integer ... seq){
            this.seqList = solveNullList(seq);
            return this;
        }

        public QueryBuilder seqList(List<Integer> seq){
            this.seqList = seq;
            return this;
        }

        public QueryBuilder fetchSeq(){
            setFetchFields("fetchFields","seq");
            return this;
        }

        public QueryBuilder excludeSeq(){
            setFetchFields("excludeFields","seq");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }

        public QueryBuilder fuzzyOperator (List<String> fuzzyOperator){
            this.fuzzyOperator = fuzzyOperator;
            return this;
        }

        public QueryBuilder fuzzyOperator (String ... fuzzyOperator){
            this.fuzzyOperator = solveNullList(fuzzyOperator);
            return this;
        }

        public QueryBuilder rightFuzzyOperator (List<String> rightFuzzyOperator){
            this.rightFuzzyOperator = rightFuzzyOperator;
            return this;
        }

        public QueryBuilder rightFuzzyOperator (String ... rightFuzzyOperator){
            this.rightFuzzyOperator = solveNullList(rightFuzzyOperator);
            return this;
        }

        public QueryBuilder operator(String operator){
            setOperator(operator);
            return this;
        }

        public QueryBuilder operatorList(String ... operator){
            this.operatorList = solveNullList(operator);
            return this;
        }

        public QueryBuilder operatorList(List<String> operator){
            this.operatorList = operator;
            return this;
        }

        public QueryBuilder fetchOperator(){
            setFetchFields("fetchFields","operator");
            return this;
        }

        public QueryBuilder excludeOperator(){
            setFetchFields("excludeFields","operator");
            return this;
        }

        public QueryBuilder fuzzyOperateIp (List<String> fuzzyOperateIp){
            this.fuzzyOperateIp = fuzzyOperateIp;
            return this;
        }

        public QueryBuilder fuzzyOperateIp (String ... fuzzyOperateIp){
            this.fuzzyOperateIp = solveNullList(fuzzyOperateIp);
            return this;
        }

        public QueryBuilder rightFuzzyOperateIp (List<String> rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = rightFuzzyOperateIp;
            return this;
        }

        public QueryBuilder rightFuzzyOperateIp (String ... rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = solveNullList(rightFuzzyOperateIp);
            return this;
        }

        public QueryBuilder operateIp(String operateIp){
            setOperateIp(operateIp);
            return this;
        }

        public QueryBuilder operateIpList(String ... operateIp){
            this.operateIpList = solveNullList(operateIp);
            return this;
        }

        public QueryBuilder operateIpList(List<String> operateIp){
            this.operateIpList = operateIp;
            return this;
        }

        public QueryBuilder fetchOperateIp(){
            setFetchFields("fetchFields","operateIp");
            return this;
        }

        public QueryBuilder excludeOperateIp(){
            setFetchFields("excludeFields","operateIp");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Dept build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> levelList;

        public List<String> getLevelList(){return this.levelList;}


        private List<String> fuzzyLevel;

        public List<String> getFuzzyLevel(){return this.fuzzyLevel;}

        private List<String> rightFuzzyLevel;

        public List<String> getRightFuzzyLevel(){return this.rightFuzzyLevel;}
        private List<Integer> seqList;

        public List<Integer> getSeqList(){return this.seqList;}

        private Integer seqSt;

        private Integer seqEd;

        public Integer getSeqSt(){return this.seqSt;}

        public Integer getSeqEd(){return this.seqEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> operatorList;

        public List<String> getOperatorList(){return this.operatorList;}


        private List<String> fuzzyOperator;

        public List<String> getFuzzyOperator(){return this.fuzzyOperator;}

        private List<String> rightFuzzyOperator;

        public List<String> getRightFuzzyOperator(){return this.rightFuzzyOperator;}
        private List<String> operateIpList;

        public List<String> getOperateIpList(){return this.operateIpList;}


        private List<String> fuzzyOperateIp;

        public List<String> getFuzzyOperateIp(){return this.fuzzyOperateIp;}

        private List<String> rightFuzzyOperateIp;

        public List<String> getRightFuzzyOperateIp(){return this.rightFuzzyOperateIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public ConditionBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public ConditionBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public ConditionBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public ConditionBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public ConditionBuilder fuzzyLevel (List<String> fuzzyLevel){
            this.fuzzyLevel = fuzzyLevel;
            return this;
        }

        public ConditionBuilder fuzzyLevel (String ... fuzzyLevel){
            this.fuzzyLevel = solveNullList(fuzzyLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyLevel (List<String> rightFuzzyLevel){
            this.rightFuzzyLevel = rightFuzzyLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyLevel (String ... rightFuzzyLevel){
            this.rightFuzzyLevel = solveNullList(rightFuzzyLevel);
            return this;
        }

        public ConditionBuilder levelList(String ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public ConditionBuilder levelList(List<String> level){
            this.levelList = level;
            return this;
        }

        public ConditionBuilder seqBetWeen(Integer seqSt,Integer seqEd){
            this.seqSt = seqSt;
            this.seqEd = seqEd;
            return this;
        }

        public ConditionBuilder seqGreaterEqThan(Integer seqSt){
            this.seqSt = seqSt;
            return this;
        }
        public ConditionBuilder seqLessEqThan(Integer seqEd){
            this.seqEd = seqEd;
            return this;
        }


        public ConditionBuilder seqList(Integer ... seq){
            this.seqList = solveNullList(seq);
            return this;
        }

        public ConditionBuilder seqList(List<Integer> seq){
            this.seqList = seq;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder fuzzyOperator (List<String> fuzzyOperator){
            this.fuzzyOperator = fuzzyOperator;
            return this;
        }

        public ConditionBuilder fuzzyOperator (String ... fuzzyOperator){
            this.fuzzyOperator = solveNullList(fuzzyOperator);
            return this;
        }

        public ConditionBuilder rightFuzzyOperator (List<String> rightFuzzyOperator){
            this.rightFuzzyOperator = rightFuzzyOperator;
            return this;
        }

        public ConditionBuilder rightFuzzyOperator (String ... rightFuzzyOperator){
            this.rightFuzzyOperator = solveNullList(rightFuzzyOperator);
            return this;
        }

        public ConditionBuilder operatorList(String ... operator){
            this.operatorList = solveNullList(operator);
            return this;
        }

        public ConditionBuilder operatorList(List<String> operator){
            this.operatorList = operator;
            return this;
        }

        public ConditionBuilder fuzzyOperateIp (List<String> fuzzyOperateIp){
            this.fuzzyOperateIp = fuzzyOperateIp;
            return this;
        }

        public ConditionBuilder fuzzyOperateIp (String ... fuzzyOperateIp){
            this.fuzzyOperateIp = solveNullList(fuzzyOperateIp);
            return this;
        }

        public ConditionBuilder rightFuzzyOperateIp (List<String> rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = rightFuzzyOperateIp;
            return this;
        }

        public ConditionBuilder rightFuzzyOperateIp (String ... rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = solveNullList(rightFuzzyOperateIp);
            return this;
        }

        public ConditionBuilder operateIpList(String ... operateIp){
            this.operateIpList = solveNullList(operateIp);
            return this;
        }

        public ConditionBuilder operateIpList(List<String> operateIp){
            this.operateIpList = operateIp;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Dept obj;

        public Builder(){
            this.obj = new Dept();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder parentId(Integer parentId){
            this.obj.setParentId(parentId);
            return this;
        }
        public Builder level(String level){
            this.obj.setLevel(level);
            return this;
        }
        public Builder seq(Integer seq){
            this.obj.setSeq(seq);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder operator(String operator){
            this.obj.setOperator(operator);
            return this;
        }
        public Builder operateIp(String operateIp){
            this.obj.setOperateIp(operateIp);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Dept build(){return obj;}
    }

}
